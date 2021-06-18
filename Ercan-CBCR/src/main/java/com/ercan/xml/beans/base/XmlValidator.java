package com.btc.xml.beans.base;



import org.apache.log4j.Logger;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

/*
 * @author ekaymaz
 * */
public class XmlValidator {
	
	private static Logger log = Logger.getLogger(XmlValidator.class);
	List<ValidationError> validationErrors = new LinkedList<ValidationError>();

	public class XmlValidatorErrorHandler implements ErrorHandler {

		public void handleError(SAXParseException exception, ValidationError.ValidationExceptionSeverity severity) {
			validationErrors.add(new ValidationError(exception, severity));
		}

		public void warning(SAXParseException exception) throws SAXException {
			handleError(exception, ValidationError.ValidationExceptionSeverity.WARNING);
		}

		public void error(SAXParseException exception) throws SAXException {
			handleError(exception, ValidationError.ValidationExceptionSeverity.ERROR);
		}

		public void fatalError(SAXParseException exception) throws SAXException {
			handleError(exception, ValidationError.ValidationExceptionSeverity.FATAL);
		}
	}

	public boolean validateContent(String schemaContent, String xmlContent) {
		
		validationErrors.clear();
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		boolean result = true;

		try {
			Schema schema = factory.newSchema(new StreamSource(new StringReader(schemaContent)));
			Validator validator = schema.newValidator();
			validator.setErrorHandler(new XmlValidatorErrorHandler());
			Source source = new StreamSource(new StringReader(xmlContent));
			validator.validate(source);
		} catch (Exception ex) {
			validationErrors.add(new ValidationError(ex, ValidationError.ValidationExceptionSeverity.FATAL));
			result = false;
		} 
		return result;
	}

	public boolean validateSchemaFile(String schemaFile, String xmlContent) {
		
		validationErrors.clear();
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		boolean result = true;

		try {
			File schemaLocation = new File(schemaFile);
			Schema schema = factory.newSchema(schemaLocation);
			Validator validator = schema.newValidator();
			validator.setErrorHandler(new XmlValidatorErrorHandler());
			Source source = new StreamSource(new StringReader(xmlContent));
			validator.validate(source);
		} catch (Exception ex) {
			validationErrors.add(new ValidationError(ex, ValidationError.ValidationExceptionSeverity.FATAL));
			result = false;
		} 
		return result;
	}


	
	public boolean validate(String schemaFile, String xmlFile) {
	
		validationErrors.clear();
		SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		boolean result = true;

		try {
			File schemaLocation = new File(schemaFile);
			Schema schema = factory.newSchema(schemaLocation);
			Validator validator = schema.newValidator();
			validator.setErrorHandler(new XmlValidatorErrorHandler());
			Source source = new StreamSource(xmlFile);
			validator.validate(source);
		} catch (Exception ex) {
			validationErrors.add(new ValidationError(ex, ValidationError.ValidationExceptionSeverity.FATAL));
			result = false;
		}
		if (validationErrors.size() != 0) {
			for (int i = 0; i < validationErrors.size(); i++) {
				log.info("Validation Error" + validationErrors.get(i).getOriginalException().getMessage()+validationErrors.get(i).getLine());
				FacesContext.getCurrentInstance().addMessage(null,
		                new FacesMessage("Validation Error" + validationErrors.get(i).getOriginalException().getMessage()));
			}
			result=false;
		}else {
			FacesContext.getCurrentInstance().addMessage(null,
	                new FacesMessage("Şematron Validasyonu Başarılı."));
		}
		return result;
	}

	public List<ValidationError> getValidationErrors() {
		return validationErrors;
	}
}
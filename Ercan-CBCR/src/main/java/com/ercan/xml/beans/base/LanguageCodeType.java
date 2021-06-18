
package com.btc.xml.beans.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageCode_Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCode_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AA"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="AF"/&gt;
 *     &lt;enumeration value="AK"/&gt;
 *     &lt;enumeration value="SQ"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AR"/&gt;
 *     &lt;enumeration value="AN"/&gt;
 *     &lt;enumeration value="HY"/&gt;
 *     &lt;enumeration value="AS"/&gt;
 *     &lt;enumeration value="AV"/&gt;
 *     &lt;enumeration value="AE"/&gt;
 *     &lt;enumeration value="AY"/&gt;
 *     &lt;enumeration value="AZ"/&gt;
 *     &lt;enumeration value="BA"/&gt;
 *     &lt;enumeration value="BM"/&gt;
 *     &lt;enumeration value="EU"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BN"/&gt;
 *     &lt;enumeration value="BH"/&gt;
 *     &lt;enumeration value="BI"/&gt;
 *     &lt;enumeration value="BS"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="MY"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CH"/&gt;
 *     &lt;enumeration value="CE"/&gt;
 *     &lt;enumeration value="ZH"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="CV"/&gt;
 *     &lt;enumeration value="KW"/&gt;
 *     &lt;enumeration value="CO"/&gt;
 *     &lt;enumeration value="CR"/&gt;
 *     &lt;enumeration value="CS"/&gt;
 *     &lt;enumeration value="DA"/&gt;
 *     &lt;enumeration value="DV"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="DZ"/&gt;
 *     &lt;enumeration value="EN"/&gt;
 *     &lt;enumeration value="EO"/&gt;
 *     &lt;enumeration value="ET"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FO"/&gt;
 *     &lt;enumeration value="FJ"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="FY"/&gt;
 *     &lt;enumeration value="FF"/&gt;
 *     &lt;enumeration value="KA"/&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="GD"/&gt;
 *     &lt;enumeration value="GA"/&gt;
 *     &lt;enumeration value="GL"/&gt;
 *     &lt;enumeration value="GV"/&gt;
 *     &lt;enumeration value="EL"/&gt;
 *     &lt;enumeration value="GN"/&gt;
 *     &lt;enumeration value="GU"/&gt;
 *     &lt;enumeration value="HT"/&gt;
 *     &lt;enumeration value="HA"/&gt;
 *     &lt;enumeration value="HE"/&gt;
 *     &lt;enumeration value="HZ"/&gt;
 *     &lt;enumeration value="HI"/&gt;
 *     &lt;enumeration value="HO"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IG"/&gt;
 *     &lt;enumeration value="IS"/&gt;
 *     &lt;enumeration value="IO"/&gt;
 *     &lt;enumeration value="II"/&gt;
 *     &lt;enumeration value="IU"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IA"/&gt;
 *     &lt;enumeration value="ID"/&gt;
 *     &lt;enumeration value="IK"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="JV"/&gt;
 *     &lt;enumeration value="JA"/&gt;
 *     &lt;enumeration value="KL"/&gt;
 *     &lt;enumeration value="KN"/&gt;
 *     &lt;enumeration value="KS"/&gt;
 *     &lt;enumeration value="KR"/&gt;
 *     &lt;enumeration value="KK"/&gt;
 *     &lt;enumeration value="KM"/&gt;
 *     &lt;enumeration value="KI"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="KY"/&gt;
 *     &lt;enumeration value="KV"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="KO"/&gt;
 *     &lt;enumeration value="KJ"/&gt;
 *     &lt;enumeration value="KU"/&gt;
 *     &lt;enumeration value="LO"/&gt;
 *     &lt;enumeration value="LA"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LI"/&gt;
 *     &lt;enumeration value="LN"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="LG"/&gt;
 *     &lt;enumeration value="MK"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="MI"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="MN"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="NV"/&gt;
 *     &lt;enumeration value="NR"/&gt;
 *     &lt;enumeration value="ND"/&gt;
 *     &lt;enumeration value="NG"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="NN"/&gt;
 *     &lt;enumeration value="NB"/&gt;
 *     &lt;enumeration value="NO"/&gt;
 *     &lt;enumeration value="NY"/&gt;
 *     &lt;enumeration value="OC"/&gt;
 *     &lt;enumeration value="OJ"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="OM"/&gt;
 *     &lt;enumeration value="OS"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="FA"/&gt;
 *     &lt;enumeration value="PI"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="PS"/&gt;
 *     &lt;enumeration value="QU"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="RN"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="SG"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SN"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SO"/&gt;
 *     &lt;enumeration value="ST"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="SC"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SS"/&gt;
 *     &lt;enumeration value="SU"/&gt;
 *     &lt;enumeration value="SW"/&gt;
 *     &lt;enumeration value="SV"/&gt;
 *     &lt;enumeration value="TY"/&gt;
 *     &lt;enumeration value="TA"/&gt;
 *     &lt;enumeration value="TT"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *     &lt;enumeration value="TH"/&gt;
 *     &lt;enumeration value="BO"/&gt;
 *     &lt;enumeration value="TI"/&gt;
 *     &lt;enumeration value="TO"/&gt;
 *     &lt;enumeration value="TN"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="TK"/&gt;
 *     &lt;enumeration value="TR"/&gt;
 *     &lt;enumeration value="TW"/&gt;
 *     &lt;enumeration value="UG"/&gt;
 *     &lt;enumeration value="UK"/&gt;
 *     &lt;enumeration value="UR"/&gt;
 *     &lt;enumeration value="UZ"/&gt;
 *     &lt;enumeration value="VE"/&gt;
 *     &lt;enumeration value="VI"/&gt;
 *     &lt;enumeration value="VO"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *     &lt;enumeration value="XH"/&gt;
 *     &lt;enumeration value="YI"/&gt;
 *     &lt;enumeration value="YO"/&gt;
 *     &lt;enumeration value="ZA"/&gt;
 *     &lt;enumeration value="ZU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LanguageCode_Type", namespace = "urn:oecd:ties:isocbctypes:v1")
@XmlEnum
public enum LanguageCodeType {


    /**
     * Afar
     * 
     */
	Afar("AA"),

    /**
     * Abkhazian
     * 
     */
	Abkhazian("AB"),

    /**
     * Afrikaans
     * 
     */
	Afrikaans("AF"),

    /**
     * Akan
     * 
     */
	Akan("AK"),

    /**
     * Albanian
     * 
     */
	Albanian("SQ"),

    /**
     * Amharic
     * 
     */
	Amharic("AM"),

    /**
     * Arabic
     * 
     */
	Arabic("AR"),

    /**
     * Aragonese
     * 
     */
	Aragonese("AN"),

    /**
     * Armenian
     * 
     */
	Armenian("HY"),

    /**
     * Assamese
     * 
     */
	Assamese("AS"),

    /**
     * Avaric
     * 
     */
	Avaric("AV"),

    /**
     * Avestan
     * 
     */
	Avestan("AE"),

    /**
     * Aymara
     * 
     */
	Aymara("AY"),

    /**
     * Azerbaijani
     * 
     */
	Azerbaijani("AZ"),

    /**
     * Bashkir
     * 
     */
	Bashkir("BA"),

    /**
     * Bambara
     * 
     */
	Bambara("BM"),

    /**
     * Basque
     * 
     */
	Basque("EU"),

    /**
     * Belarusian
     * 
     */
	Belarusian("BE"),

    /**
     * Bengali
     * 
     */
	Bengali("BN"),

    /**
     * Bihari languages
     * 
     */
	Biharilanguages("BH"),

    /**
     * Bislama
     * 
     */
	Bislama("BI"),

    /**
     * Bosnian
     * 
     */
	Bosnian("BS"),

    /**
     * Breton
     * 
     */
	Breton("BR"),

    /**
     * Bulgarian
     * 
     */
	Bulgarian("BG"),

    /**
     * Burmese
     * 
     */
	Burmese("MY"),

    /**
     * Catalan; Valencian
     * 
     */
	Catalan("CA"),

    /**
     * Chamorro
     * 
     */
	Chamorro("CH"),

    /**
     * Chechen
     * 
     */
	Chechen("CE"),

    /**
     * Chinese
     * 
     */
	Chinese("ZH"),

    /**
     * Church Slavic; Old Slavonic; Church Slavonic; Old Bulgarian; Old Church Slavonic
     * 
     */
	ChurchSlavic("CU"),

    /**
     * Chuvash
     * 
     */
    Chuvash("CV"),

    /**
     * Cornish
     * 
     */
    Cornish("KW"),

    /**
     * Corsican
     * 
     */
    Corsican("CO"),

    /**
     * Cree
     * 
     */
    Cree("CR"),

    /**
     * Czech
     * 
     */
    Czech("CS"),

    /**
     * Danish
     * 
     */
    Danish("DA"),

    /**
     * Divehi; Dhivehi; Maldivian
     * 
     */
    Divehi("DV"),

    /**
     * Dutch; Flemish
     * 
     */
    Dutch("NL"),

    /**
     * Dzongkha
     * 
     */
    Dzongkha("DZ"),

    /**
     * English
     * 
     */
    English("EN"),

    /**
     * Esperanto
     * 
     */
    Esperanto("EO"),

    /**
     * Estonian
     * 
     */
    Estonian("ET"),

    /**
     * Ewe
     * 
     */
    Ewe("EE"),

    /**
     * Faroese
     * 
     */
    Faroese("FO"),

    /**
     * Fijian
     * 
     */
    Fijian("FJ"),

    /**
     * Finnish
     * 
     */
    Finnish("FI"),

    /**
     * French
     * 
     */
    French("FR"),

    /**
     * Western Frisian
     * 
     */
    WesternFrisian("FY"),

    /**
     * Fulah
     * 
     */
    Fulah("FF"),

    /**
     * Georgian
     * 
     */
    Georgian("KA"),

    /**
     * German
     * 
     */
    German("DE"),

    /**
     * Gaelic; Scottish Gaelic
     * 
     */
    Gaelic("GD"),

    /**
     * Irish
     * 
     */
    Irish("GA"),

    /**
     * Galician
     * 
     */
    Galician("GL"),

    /**
     * Manx
     * 
     */
    Manx("GV"),

    /**
     * Greek
     * 
     */
    Greek("EL"),

    /**
     * Guarani
     * 
     */
    Guarani("GN"),

    /**
     * Gujarati
     * 
     */
    Gujarati("GU"),

    /**
     * Haitian; Haitian Creole
     * 
     */
    Haitian("HT"),

    /**
     * Hausa
     * 
     */
    Hausa("HA"),

    /**
     * Hebrew
     * 
     */
    Hebrew("HE"),

    /**
     * Herero
     * 
     */
    Herero("HZ"),

    /**
     * Hindi
     * 
     */
    Hindi("HI"),

    /**
     * Hiri Motu
     * 
     */
    HiriMotu("HO"),

    /**
     * Croatian
     * 
     */
    Croatian("HR"),

    /**
     * Hungarian
     * 
     */
    Hungarian("HU"),

    /**
     * Igbo
     * 
     */
    Igbo("IG"),

    /**
     * Icelandic
     * 
     */
    Icelandic("IS"),

    /**
     * Ido
     * 
     */
    Ido("IO"),

    /**
     * Sichuan Yi; Nuosu
     * 
     */
    SichuanYi("II"),

    /**
     * Inuktitut
     * 
     */
    Inuktitut("IU"),

    /**
     * Interlingue; Occidental
     * 
     */
    Interlingue("IE"),

    /**
     * Interlingua (International Auxiliary Language Association)
     * 
     */
    Interlingua("IA"),

    /**
     * Indonesian
     * 
     */
    Indonesian("ID"),

    /**
     * Inupiaq
     * 
     */
    Inupiaq("IK"),

    /**
     * Italian
     * 
     */
    Italian("IT"),

    /**
     * Javanese
     * 
     */
    Javanese("JV"),

    /**
     * Japanese
     * 
     */
    Japanese("JA"),

    /**
     * Kalaallisut; Greenlandic
     * 
     */
    Kalaallisut("KL"),

    /**
     * Kannada
     * 
     */
    Kannada("KN"),

    /**
     * Kashmiri
     * 
     */
    Kashmiri("KS"),

    /**
     * Kanuri
     * 
     */
    Kanuri("KR"),

    /**
     * Kazakh
     * 
     */
    Kazakh("KK"),

    /**
     * Central Khmer
     * 
     */
    CentralKhmer("KM"),

    /**
     * Kikuyu; Gikuyu
     * 
     */
    Kikuyu("KI"),

    /**
     * Kinyarwanda
     * 
     */
    Kinyarwanda("RW"),

    /**
     * Kirghiz; Kyrgyz
     * 
     */
    Kirghiz("KY"),

    /**
     * Komi
     * 
     */
    Komi("KV"),

    /**
     * Kongo
     * 
     */
    Kongo("KG"),

    /**
     * Korean
     * 
     */
    Korean("KO"),

    /**
     * Kuanyama; Kwanyama
     * 
     */
    		Kuanyama("KJ"),

    /**
     * Kurdish
     * 
     */
    		Kurdish("KU"),

    /**
     * Lao
     * 
     */
    		Lao("LO"),

    /**
     * Latin
     * 
     */
    		Latin("LA"),

    /**
     * Latvian
     * 
     */
    		Latvian("LV"),

    /**
     * Limburgan; Limburger; Limburgish
     * 
     */
    		Limburgan("LI"),

    /**
     * Lingala
     * 
     */
    		Lingala("LN"),

    /**
     * Lithuanian
     * 
     */
    		Lithuanian("LT"),

    /**
     * Luxembourgish; Letzeburgesch
     * 
     */
    		Luxembourgish("LB"),

    /**
     * Luba-Katanga
     * 
     */
    		Luba("LU"),

    /**
     * Ganda
     * 
     */
    		Ganda("LG"),

    /**
     * Macedonian
     * 
     */
    		Macedonian("MK"),

    /**
     * Marshallese
     * 
     */
    		Marshallese("MH"),

    /**
     * Malayablam
     * 
     */
    		Malayablam("ML"),

    /**
     * Maori
     * 
     */
    		Maori("MI"),

    /**
     * Marathi
     * 
     */
    		Marathi("MR"),

    /**
     * Malay
     * 
     */
    		Malay("MS"),

    /**
     * Malagasy
     * 
     */
    		Malagasy("MG"),

    /**
     * Maltese
     * 
     */
    		Maltese("MT"),

    /**
     * Mongolian
     * 
     */
    		Mongolian("MN"),

    /**
     * Nauru
     * 
     */
    		Nauru("NA"),

    /**
     * Navajo; Navaho
     * 
     */
    		Navajo("NV"),

    /**
     * Ndebele, South; South Ndebele
     * 
     */
    		SouthNdebele("NR"),

    /**
     * Ndebele, North; North Ndebele
     * 
     */
    		NorthNdebele("ND"),

    /**
     * Ndonga
     * 
     */
    		Ndonga("NG"),

    /**
     * Nepali
     * 
     */
    		Nepali("NE"),

    /**
     * Norwegian Nynorsk; Nynorsk, Norwegian
     * 
     */
    		NorwegianNynorsk("NN"),

    /**
     * Bokm�l, Norwegian; Norwegian Bokm�l
     * 
     */
    		Bokmål("NB"),

    /**
     * Norwegian
     * 
     */
    		Norwegian("NO"),

    /**
     * Chichewa; Chewa; Nyanja
     * 
     */
    		Chichewa("NY"),

    /**
     * Occitan; Proven�al
     * 
     */
    		Occitan("OC"),

    /**
     * Ojibwa
     * 
     */
    		Ojibwa("OJ"),

    /**
     * Oriya
     * 
     */
    		Oriya("OR"),

    /**
     * Oromo
     * 
     */
    	Oromo("OM"),

    /**
     * Ossetian; Ossetic
     * 
     */
    		Ossetian("OS"),

    /**
     * Panjabi; Punjabi
     * 
     */
    		Panjabi("PA"),

    /**
     * Persian
     * 
     */
    		Persian("FA"),

    /**
     * Pali
     * 
     */
    		Pali("PI"),

    /**
     * Polish
     * 
     */
    		Polish("PL"),

    /**
     * Portuguese
     * 
     */
    		Portuguese("PT"),

    /**
     * Pushto; Pashto
     * 
     */
    		Pushto("PS"),

    /**
     * Quechua
     * 
     */
    		Quechua("QU"),

    /**
     * Romansh
     * 
     */
    		Romansh("RM"),

    /**
     * Romanian; Moldavian; Moldovan
     * 
     */
    		Romanian("RO"),

    /**
     * Rundi
     * 
     */
    		Rundi("RN"),

    /**
     * Russian
     * 
     */
    		Russian("RU"),

    /**
     * Sango
     * 
     */
    		Sango("SG"),

    /**
     * Sanskrit
     * 
     */
    		Sanskrit("SA"),

    /**
     * Sinhala; Sinhalese
     * 
     */
    		Sinhala("SI"),

    /**
     * Slovak
     * 
     */
    		Slovak("SK"),

    /**
     * Slovenian
     * 
     */
    		Slovenian("SL"),

    /**
     * Northern Sami
     * 
     */
    		NorthernSami("SE"),

    /**
     * Samoan
     * 
     */
    		Samoan("SM"),

    /**
     * Shona
     * 
     */
    		Shona("SN"),

    /**
     * Sindhi
     * 
     */
    		Sindhi("SD"),

    /**
     * Somali
     * 
     */
    		Somali("SO"),

    /**
     * Sotho, Southern
     * 
     */
    		Sotho("ST"),

    /**
     * Spanish; Castilian
     * 
     */
    		Spanish("ES"),

    /**
     * Sardinian
     * 
     */
    		Sardinian("SC"),

    /**
     * Serbian
     * 
     */
    		Serbian("SR"),

    /**
     * Swati
     * 
     */
    		Swati("SS"),

    /**
     * Sundanese
     * 
     */
    		Sundanese("SU"),

    /**
     * Swahili
     * 
     */
    		Swahili("SW"),

    /**
     * Swedish
     * 
     */
    		Swedish("SV"),

    /**
     * Tahitian
     * 
     */
    		Tahitian("TY"),

    /**
     * Tamil
     * 
     */
    		Tamil("TA"),

    /**
     * Tatar
     * 
     */
    		Tatar("TT"),

    /**
     * Telugu
     * 
     */
    		Telugu("TE"),

    /**
     * Tajik
     * 
     */
    		Tajik("TG"),

    /**
     * Tagalog
     * 
     */
    		Tagalog("TL"),

    /**
     * Thai
     * 
     */
    		Thai("TH"),

    /**
     * Tibetan
     * 
     */
    		Tibetan("BO"),

    /**
     * Tigrinya
     * 
     */
    		Tigrinya("TI"),

    /**
     * Tonga (Tonga Islands)
     * 
     */
    		Tonga("TO"),

    /**
     * Tswana
     * 
     */
    		Tswana("TN"),

    /**
     * Tsonga
     * 
     */
    		Tsonga("TS"),

    /**
     * Turkmen
     * 
     */
    		Turkmen("TK"),

    /**
     * Turkish
     * 
     */
    		Turkish("TR"),

    /**
     * Twi
     * 
     */
    		Twi("TW"),

    /**
     * Uighur; Uyghur
     * 
     */
    		Uighur("UG"),

    /**
     * Ukrainian
     * 
     */
    		Ukrainian("UK"),

    /**
     * Urdu
     * 
     */
    		Urdu("UR"),

    /**
     * Uzbek
     * 
     */
    		Uzbek("UZ"),

    /**
     * Venda
     * 
     */
    		Venda("VE"),

    /**
     * Vietnamese
     * 
     */
    		Vietnamese("VI"),

    /**
     * Volap�k
     * 
     */
    		Volapük("VO"),

    /**
     * Welsh
     * 
     */
    		Welsh("CY"),

    /**
     * Walloon
     * 
     */
    		Walloon("WA"),

    /**
     * Wolof
     * 
     */
    		Wolof("WO"),

    /**
     * Xhosa
     * 
     */
    		Xhosa("XH"),

    /**
     * Yiddish
     * 
     */
    		Yiddish("YI"),

    /**
     * Yoruba
     * 
     */
    		Yoruba("YO"),

    /**
     * Zhuang; Chuang
     * 
     */
    		Zhuang("ZA"),

    /**
     * Zulu
     * 
     */
    		Zulu("ZU");

   
    private final String value;

    LanguageCodeType(String v) {
        value = v;
    }

    

    public String getValue() {
		return value;
	}



	public static LanguageCodeType fromValue(String v) {
        for (LanguageCodeType c: LanguageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}

package data;

public class GlobalVariables {

	public static String id;
	public static int id1;
	public static String token;
	
	public static String[] parametersList = {"totalCount", "filteredCount", "taken", "skipped", "sortColumnName", "sortColumnDirection", "dataCount", "data"};
	
	public static String[] sveListe = {"COMPANIES.LIST", "FIELD.UNITS.LIST", "FIELD.OFFICES.LIST", "SUPPLIERS.LIST", "READERS.LIST", "ENTITIES.LIST", "MUNICIPALITIES.LIST",
			"PLACES.LIST", "POST.OFFICES.LIST", "STREETS.LIST", "INSTALLMENT.PERSONS.LIST", "INSTALLMENT.PERSON.LOCATIONS.LIST", "AREA.TYPES.LIST"};

	public static String[] companiesClmns = {"id", "name", "postOfficeText", "placeText", "address", "phone", "fax", "email", "www", "callCenter", "bankAccount"};
	public static String[] fieldUnitClmns = {"id", "name", "code", "companyText", "bankAccount", "placeText", "address", "phone", "callCenter", "fax", "email"};
	public static String[] fieldOfficeClmns = {"id", "name", "code", "fieldUnitText", "placeText", "address", "phone", "fax", "email"};
	public static String[] suppliersClmns = {"id", "name", "bankAccount", "postOfficeText", "placeText", "address", "phone", "callCenter", "fax", "email", "www"};
	public static String[] readersClmns = {"id", "name", "mobilePhoneNumber", "userText", "dateFrom", "dateTo", "fieldUnitText", "fieldOfficeText"};
	public static String[] entitiesClmns = {"id", "name"};
	public static String[] municipalitiesClmns = {"id", "name", "entityText", "countryText"};
	public static String[] placesClmns = {"id", "name", "municipalityText"};
	public static String[] postOfficesClmns = {"id", "name", "printName"};
	public static String[] streetsClmns = {"id", "name"};
	public static String[] installmentPersonsClmns = {"id", "name", "phoneNumber"};
	public static String[] installmentPersonLocationsClmns = {"id", "installmentPersonText", "fieldUnitText", "fieldOfficeText", "dateFrom", "dateTo"};
	public static String[] areaTypesClmns = {"id", "name"};
	
	public static String[][] sveKolone = {companiesClmns, fieldUnitClmns, fieldOfficeClmns, suppliersClmns, readersClmns, entitiesClmns, municipalitiesClmns,
			placesClmns, postOfficesClmns, streetsClmns, installmentPersonsClmns, installmentPersonLocationsClmns, areaTypesClmns};
	
}

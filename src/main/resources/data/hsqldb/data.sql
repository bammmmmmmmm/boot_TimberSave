INSERT INTO Case_ (
	case_solnUsed_Name, case_isListedBuilding, case_isOccupiedBuilding, case_hasExposedArt, case_geoTempMax, case_geoTempMin, case_geoHumidityPercentage,
	case_structArea_cat, case_structArea_type, case_structArea_isExposed, case_dmgComponent_name, case_dmgComponent_locn, case_dmgComponent_structPurp,
	case_dmgComponent_materialGrade, case_dmgComponent_csArea, case_dmgComponent_csSpan, case_dmgComponent_dmgPercentage
) VALUES (
	'soln1', true, true, true, 40, 5, 60,
	'roof', 'gambrel', false, 'truss', 'end', 'tension',
	'Grade A', 55, 5000, 12
);
INSERT INTO Case_ (
	case_solnUsed_Name, case_isListedBuilding, case_isOccupiedBuilding, case_hasExposedArt, case_geoTempMax, case_geoTempMin, case_geoHumidityPercentage,
	case_structArea_cat, case_structArea_type, case_structArea_isExposed, case_dmgComponent_name, case_dmgComponent_locn, case_dmgComponent_structPurp,
	case_dmgComponent_materialGrade, case_dmgComponent_csArea, case_dmgComponent_csSpan, case_dmgComponent_dmgPercentage
) VALUES (
	'soln5', false, true, true, 35, 1, 20,
	'roof', 'gambrel', true, 'truss', 'center', 'compression',
	'Grade A', 60, 1800, 20
);
INSERT INTO Case_ (
	case_solnUsed_Name, case_isListedBuilding, case_isOccupiedBuilding, case_hasExposedArt, case_geoTempMax, case_geoTempMin, case_geoHumidityPercentage,
	case_structArea_cat, case_structArea_type, case_structArea_isExposed, case_dmgComponent_name, case_dmgComponent_locn, case_dmgComponent_structPurp,
	case_dmgComponent_materialGrade, case_dmgComponent_csArea, case_dmgComponent_csSpan, case_dmgComponent_dmgPercentage
) VALUES (
	'soln5', false, true, true, 35, 1, 20,
	'roof', 'gambrel', true, 'truss', 'end', 'tension',
	'Grade A', 50, 4800, 15
);
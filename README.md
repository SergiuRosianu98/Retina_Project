# Retina_Project

Maven Run Command: mvnw.cmd spring-boot:run


GET Endpoints:
  •	dataset/stats/total - returns a JSON containing the total number of events from dataset.
  •	dataset/stats/offenses - returns a JSON containing the number of events for each KY_CD, ordered ascending.
  
DELETE Endpoints:
  •	/dataset/{id} - deletes the event having the specified "id".

POST Endpoints:
  •	/dataset - posts a JSON object.
  
Post Request Example:
  {
    "CMPLNT_NUM": "999999999",
    "KY_CD": "231"
  }
  


```
POST http://localhost:8080/valid/test
Content-Type: application/json
Cache-Control: no-cache

{"source":"source", "child" : {"type": "E", "destination":"" } }

<> 2021-04-15T102002.200.txt

Parent(source=source, child=Child(enum=E, destination=))

###

POST http://localhost:8080/valid/test
Content-Type: application/json
Cache-Control: no-cache

{"source":"", "child" : {"type": "E", "destination":"" } }

<> 2021-04-15T102020.400.json

{
  "timestamp": "2021-04-15T19:21:00.226+00:00",
  "status": 400,
  "error": "Bad Request",
  "message": "",
  "path": "/valid/test"
}
```

# Project: Java Spring Boot Demo

## End-point: Get all person
### Method: GET
>```
>http://localhost:8080/api/v1/person
>```
### Headers

|Content-Type|Value|
|---|---|
|User-Agent|insomnia/8.5.1|


### Response: 200
```json
[
    {
        "id": "112f5fab-7b25-4af1-8083-c44f93e8bfca",
        "name": "yet"
    },
    {
        "id": "4b77da79-f94c-4c14-9c6e-0015ec4993b9",
        "name": "uyeeeter"
    }
]
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Get Person By ID
### Method: GET
>```
>http://localhost:8080/api/v1/person/112f5fab-7b25-4af1-8083-c44f93e8bfca
>```
### Headers

|Content-Type|Value|
|---|---|
|User-Agent|insomnia/8.5.1|


### Response: 200
```json
{
    "id": "112f5fab-7b25-4af1-8083-c44f93e8bfca",
    "name": "yet"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Update Person by ID
### Method: PUT
>```
>http://localhost:8080/api/v1/person/4b77da79-f94c-4c14-9c6e-0015ec4993b9
>```
### Headers

|Content-Type|Value|
|---|---|
|Content-Type|application/json|


### Headers

|Content-Type|Value|
|---|---|
|User-Agent|insomnia/8.5.1|


### Body (**raw**)

```json
{
	"id": "4b77da79-f94c-4c14-9c6e-0015ec4993b9",
	"name": "uyeeeter"
}
```

### Response: 200
```json
{
    "id": "4b77da79-f94c-4c14-9c6e-0015ec4993b9",
    "name": "uyeeeter"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Delete Person By ID
### Method: DELETE
>```
>http://localhost:8080/api/v1/person/40c1ce98-c671-4576-bc1c-6c5802c7ece0
>```
### Headers

|Content-Type|Value|
|---|---|
|Content-Type|application/json|


### Headers

|Content-Type|Value|
|---|---|
|User-Agent|insomnia/8.5.1|



⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃

## End-point: Insert person
### Method: POST
>```
>http://localhost:8080/api/v1/person
>```
### Headers

|Content-Type|Value|
|---|---|
|Content-Type|application/json|


### Headers

|Content-Type|Value|
|---|---|
|User-Agent|insomnia/8.5.1|


### Body (**raw**)

```json
{
 "name": "yeSJSt"
}	
```

### Response: 200
```json
{
    "id": "0b7af51d-257f-488e-a770-90cf9dec28ca",
    "name": "yeSJSt"
}
```


⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃ ⁃
_________________________________________________
Powered By: [postman-to-markdown](https://github.com/bautistaj/postman-to-markdown/)

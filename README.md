# Spring Boot Device Seller App

## Endpoints

### Sign-Up

````
POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 86

{
    "name": "altabano",
    "username": "altabano",
    "password": "altabano"
}
````


### Sign-In

````
POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 61

{
    "username": "altabano",
    "password":" altabano"
}
````


### Change-Role

````
PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbHRhYmFubyIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjQ5MTI4NTI1fQ.VjG7yF-CCtakfgoLgMU_QnPXlaNuiytFkwYNNQ3PuWuQKZrOuSqNwdZBLt10Z67Bfb1dLb_0UezYWuhg6cZNjg
````

### Save Device

````
POST /api/device HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbHRhYmFubyIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjQ5MTI4NjE5fQ.22eQf3fOJus_WlpiF2kbyldvgQWTplYTo-HAao_Z2yyhvs-urkwvfshzFVPPcpaM2USJD9Yr_2Nnf2u7GiM7Bg
Content-Type: application/json
Content-Length: 109

{
    "name": "device_4",
    "description": "desc-4",
    "price": "9",
    "deviceType": "DESKTOP"
}

````

### Get All Devices

````
GET /api/device HTTP/1.1
Host: localhost:8080
````

### Delete Device

````
DELETE /api/device/1 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbHRhYmFubyIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjQ5MTI4NjE5fQ.22eQf3fOJus_WlpiF2kbyldvgQWTplYTo-HAao_Z2yyhvs-urkwvfshzFVPPcpaM2USJD9Yr_2Nnf2u7GiM7Bg
````

### Save Purchase

````
POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbHRhYmFubyIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjQ5MTI4NjE5fQ.22eQf3fOJus_WlpiF2kbyldvgQWTplYTo-HAao_Z2yyhvs-urkwvfshzFVPPcpaM2USJD9Yr_2Nnf2u7GiM7Bg
Content-Type: application/json
Content-Length: 80

{
    "userId": 6,
    "deviceId": 4,
    "price": 9,
    "color": "blue"
}
````

### Get All Purchases

````
GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbHRhYmFubyIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6NiwiZXhwIjoxNjQ5MTI4NjE5fQ.22eQf3fOJus_WlpiF2kbyldvgQWTplYTo-HAao_Z2yyhvs-urkwvfshzFVPPcpaM2USJD9Yr_2Nnf2u7GiM7Bg
````
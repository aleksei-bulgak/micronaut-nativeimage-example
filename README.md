### Just an a example of micronaut application

This application have simple controller like in SpringMVC that is used to:
* fetch users by id 
* fetch all users
* create new user

Example of user entity:

```json
{
	"login": "micronaut user",
	"password": "87654",
	"age": 30,
	"deleted": false
}
```

By default application is running under port `8080`

If you want to run application localy you need to setup postgres database. 
You can run it localy or use some providers like Heroku

To initialize database you need to run such script:

```sql
CREATE TABLE users (
  id        VARCHAR(200) NOT NULL PRIMARY KEY,
  login     VARCHAR(200) NOT NULL,
  password  VARCHAR(200) NOT NULL,
  age       INTEGER NOT NULL DEFAULT 4,
  delete    BOOLEAN NOT NULL DEFAULT 'false'
);
```

After database setup has been finished you need to update `application.yml` with db credentials and url.
Please replace this values with valid database info:
```yaml
    url: jdbc:postgresql://<DATABASE_HOST>:5432/<DATABASE_NAME>
    username: <USERNAME>
    password: <PASSWORD>
```
# 馃捇 Portfolio Web - #YoProgramo

*NOTA: En este repositorio se encuentra todo lo relacionado al **Backend** del proyecto, para dirigirse al repositorio del **Frotend** **[hacer click aqu铆](https://github.com/meli-morenooo/Frontend-portafolio-web "aqu铆").***
## 馃摑 Descripci贸n
- ***Backend** del **Portfolio Web Fullstack*** realizado como Proyecto Final del curso **Argentina Programa - #YoProgramo**.

- Se trata de una **API REST** realizada utilizando las tecnolog铆as **Java + Spring Boot** bajo el modelo **MVC** para la l贸gica y **MySQL** para persistencia de datos.

- A continuaci贸n se incluye el **Diagrama Entidad - Relaci贸n** (DER) utilizado en la Base de Datos Relacional y que posteriormente se traduce en los Modelos o Entidades del Backend:

<div align="center">
<img src="https://user-images.githubusercontent.com/87624300/187538129-3b45391d-9b77-46bb-89b3-ae564a3c2ebe.png" width="800px">
</div>

- Como se puede observar, las tablas se encuentran separadas debido a que a煤n no manejo bien los metodos para implementarlo de forma conjunta en el front.

- En este caso si se estableci贸 una relaci贸n con el user autorizado a editar los datos de las tablas. 

## 鈱煐? Instalaci贸n
- Si queremos correr la aplicaci贸n en un entorno local debemos tener en cuenta lo siguiente: 

1. Clonar el repositorio utilizando GIT o descargando el archivo ZIP:

    `git clone https://github.com/meli-morenooo/Backend-portafolio-web.git`

2. Instalar las dependencias de Maven utilizando nuestro IDE preferido o a trav茅s del comando:

    `mvn install`

3. Crear/Configurar el archivo _application.properties_ en src/main/resources/

```properties
# Ambiente de prueba (local)
spring.jpa.hibernate.ddl-auto = update
spring.datasource.url = jdbc:mysql://<host_DB>:<puerto_DB>/<nombre_DB>?useSSL=false&serverTimezone=UTC
spring.datasource.username = <usuario>
spring.datasource.password= <contrase帽a>
spring.jpa.database-platform = org.hibernate.dialect.MySQL8Dialect
#JWT
portfolio.jwtSecret = <clave_alfanum茅rica_JWT>
portfolio.jwtExpirationMs = <tiempo_expiraci贸n_JWT> 
```
NOTA: Reemplazar los valores borrando los <>.

4. Ejecutar nuestra aplicaci贸n iniciando el archivo `PortfolioApplication.Java` o bien ejecutando el siguiente comando:
    `mvn sprin-boot:run`

## 馃摡 Contacto
馃檵鈥嶁檪锔廠i tienes dudas o te interesa ponerte en contacto conmigo pod茅s hacerlo a trav茅s de:
**[LinkedIn](https://www.linkedin.com/in/melisa-moreno-0b4163212/) - [Github](https://github.com/meli-morenooo)**

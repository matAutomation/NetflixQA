# NetflixQA 
![image](https://github.com/matAutomation/NetflixQA/assets/149826299/3e2a829d-958e-49cf-8700-24da4522aeb3)

## Descripción

El proyecto se enfoca en la automatización de las funcionalidades presentes en la página de inicio de Netflix utilizando Java, Maven y TestNG.

## Tecnologías Utilizadas

- **Java**: Se utiliza como lenguaje de programación principal para escribir los scripts de automatización.
- **Maven**: Se utiliza para la gestión de dependencias y la ejecución de pruebas.
- **Selenium WebDriver**: Marco de automatización utilizado para interactuar con el navegador web.
- **TestNG**: Marco de pruebas utilizado para ejecutar y generar reportes detallados de los resultados de las pruebas.

## Estructura del proyecto

- `HomepPage.java`: Contiene los elementos y funcionalidades de la página de inicio de Netflix.
- `SeleniumHelpers.java`: Contiene funcionalidades de la Web, como maximizar y waits.
- `SeleniumProperties.java`: Contiene configuraciones de propiedades para inicializar Selenium.

## Como ejecutar

Para ejecutar el proyecto deben ir a la siguiente ruta donde ejecutaran el test en TestNG -> src/test/java/MyTest.java. Si prefieren ejecutar desde consola pueden ingresar el siguiente comando

```bash
mvn test
```

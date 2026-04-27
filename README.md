# Prueba Unidad 2 automatizacion de pruebas

## Descripcion

Proyecto Java desarrollado para profesionalizar el proceso de pruebas automatizadas, implementando integración contínua, gestión de versiones y automatización de métodos @Test

## Tecnologias utilizadas

Apache Maven 3.9.15
Java 21.0.7
Junit 4.13.2
Git 2.54.0.windows.1

## Estructura del proyecto

automatizacion/
----src/
    ----main\java\com\automatizacion
        ----App.java
    ----test\java\com\automatizaciona
        ----MultiplicacionTest.java
        ----TextosIgualesTest.java
----.gitignore
----pom.xml
----README.md        

## Pruebas desarrolladas

Se desarrollaron dos pruebas unitarias.
-Multiplicación y comprobar que dos resultados sean iguales. *MultipliacionTest*
-Comprobar que dos textos sean iguales *TextosIgualesTest*

## Comandos utilizados

Para inicializar nuestro repositorio:

 `git init`

Para la creacion de nuestra rama de trabajo:

`git checkout -b feature/primera-prueba`

Para la creación de nuestro proyecto Maven:

 `mvn archetype:generate -DgroupId=com.automatizacion -DartifactId=automatizacion -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

Para comprobar que nuestro proyecto Maven se haya creado y comprobar su estructura:

`find . -type f`

Para iniciar nuestro proyecto en VS Code a través de Git Bash:

`code .`

Para verificar que nuestras pruebas funcionen correctamente: 

`mvn test`

Comprobar los archivos que se subiran a nuestra rama de trabajo al realizar el commit:

`git status`

Para prepara los archivos antes del commit:

`git add .`

Para registrar los cambios:

`git commit -m "feat: Agregar estructura base del proyecto Maven"`

Para enlazar nuestro repositorio local a GitHub.

`git remote add origin https://github.com/IgnaRamos/automatizacion.git`

Para renombrar nuestra rama de prueba para que coincida con la de GitHub:

`git branch -M main`

Para que los cambios reflejados en nuestro repositorio local se vean reflejados en GitHub:

`git push u- origin main`

Para crear estructura de carpetas del Pipeline:

`mkdir .github`
`mkdir .github/workflows`

## Pipeline CI

Con nuestros repositorios local y remoto ya trabajando en conjunto, desarrollo el Pipeline que permitirá que cada vez que se haga un push o pull request se ejecuten las pruebas automatizadas, para verificar la correcta compilación del código y así en caso de que el desarrollar X quiera implementar algún cambio en la rama main deba completar las pruebas automatizadas correctamente antes de subirse a la rama main.
En primer lugar, a través de nuestra consola Git Bash dentro de la carpeta del proyecto creamos las carpetas y archivos correspondientes según la estructura estandar .github/workflows/ci.yml

El primer paso es crear nuestra carpeta .github. `mkdir .github`
Como segundo paso es crear la carpeta workflows donde se almacenan los Pipelines de integración continua. `mkdir .github/workflows`
Para finalizar la configuración e implementación de nuestro Pipeline creamos el archivo *ci.yml* dentro de nuestra carpeta workflows previamente creada, luego de crearlo debemos configurar el flujo de trabajo que tendra nuestro Pipeline, el cuál será:

1- git push o git pull request
2- GitHub detecta el push
3- Crea la maquina virtual de Linux Ubuntu donde se ejecuta el Pipeline, esto esta definido por GitHub.
4- Descarga el codigo
5- Instala Java 21
6- mvn ejecuta las pruebas
7- Guarda el reporte
8- Msje de BUILD SUCCESS o Failure








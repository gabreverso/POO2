## ENUNCIADO

Considere o domínio das fábricas de veículos. Considere que um veículo possui o seguinte comportamento padrão: ligar, rodar e parar. Considere a interface IVehicle, que possui os seguintes método: 
public void start();  
public void drive(); 
public void stop(); 

Considere a interface de fabricante de veículos IVehicleMaker, que possui o seguinte método: 
public IVehiclemakeVehicle (String modelo);

Existem vários fabricantes de veículos (IVehicleMaker) e cada um deles possui o seu grupo de modelos. Por exemplo, dois fabricantes são a Toyota e  a Honda. A Toyota possui o Corolla, a Hilux e o Etios. A Honda possui o City, o Civic e o Fit. Existem no mercado diferentes fabricantes (IvehicleMaker) cujo papel básico é fabricar veículos (makeVehicle). 
Crie o código Java mínimo que implementa as classes mencionadas e escreve um método main() simples que demonstre seu funcionamento. 
Considere e aplique um padrão Factory e um padrão Singleton no exemplo. 
Comente seu código, indicando o porquê do uso de cada padrão de projeto.


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


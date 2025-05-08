# Teste de Software - Java/JUnit
Esse projeto visa implementar uma cobertura de testes automatizados para módulos de cadastro, usuário e validações, utilizando Junit.

## 🛠 Tecnologias
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-%2325A162.svg?style=for-the-badge&logo=junit5&logoColor=white)
![JaCoCo](https://img.shields.io/badge/JaCoCo-%23007F00.svg?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-%23C71A36.svg?style=for-the-badge&logo=apache-maven&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

## Pré-requisitos
- JDK 11
- Maven 3.6+ (em caso de uso por terminal)
  
## Modulos Testados
- `Cadastro` (Testes completos — cobre fluxos principais e validações)
- `Usuario` (Cobertura majoritariamente indireta via `CadastroTest`, com casos adicionais para garantir 100% de cobertura)
- `Validacoes` (Testes completos, com testes parametrizados para validação de múltiplas entradas)

---

## Como rodar o projeto e testar

### 1. Clone o repositório
```bash
git clone https://github.com/thebiatriz/teste-software-aps.git
```

### 2. Abra o projeto corretamente no IntelliJ
Para garantir que o Maven seja reconhecido e configurado automaticamente:
- No IntelliJ, clique em File > Open...
- Selecione o arquivo **pom.xml** (e não apenas a pasta do projeto)
- O IntelliJ irá importar como um projeto Maven e carregar as dependências

### 3. Execute os testes (2 opções)
#### Pela IDE (IntelliJ)
- Clique no ícone do **Maven**
- Em `Lifecycle` clique com o botão direito do mouse em `clean` e depois clique em `Run Maven Build`
- Após isso, ainda em `Lifecycle`, repita o processo para `test`

#### Pelo terminal
- Digite o comando:
```bash
mvn clean test jacoco:report
```

---

## Abra o relatório gerado por JaCoCo
### 1. Linux/Mac
Digite no terminal:<br>
```bash
xdg-open target/site/jacoco/index.html
```

### 2. No Windows
Abra manualmente o arquivo:<br>
`teste-software-aps/target/site/jacoco/index.html`

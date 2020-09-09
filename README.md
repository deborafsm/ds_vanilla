:alien:
![GitHub repo size](https://img.shields.io/github/repo-size/deborafsm/ds_vanilla?style=badge)
![GitHub cool](https://img.shields.io/badge/DS-Vannila-red)
![GitHub author](https://img.shields.io/badge/author-DeboraFreire-lightgrey)
![GitHub last commit](https://img.shields.io/github/last-commit/deborafsm/ds_vanilla?color=red)
![GitHub language count](https://img.shields.io/github/languages/count/deborafsm/ds_vanilla?color=red)
:alien:

# Por que Linguagem Java

Java é uma linguagem de programação multiplataforma (WORA Write Once, Run Anywere - Escreva uma vez ,execute em qualquer lugar,  Slogan,  Sun Microsystems 1995).
Que Ilustra justamente a sua funcionalidade podendo ser executada em um desktop, aplicativos mobile, web, smartwatch entre outros.
# Compilação / Interpretação.
no seu compilador primário javaC se transforma em um byteCode por sua vez inici-se uma recompilação
no JVA (java virtual machine) e essa executa no ambiente.

# Apresentação 
Sistema para gerenciamento de vagas para profissionais autonomos, meio periodo e home office.

# Objetivos do sistema de gerenciamento
-Realizar o controle centralizado de profissionais autonomos,vagas,empresas.

# Fases do Projeto
1º Levantamento de Requisitos
2º Identificação de Entidade e Relacionamentos
3º Modelo E-R
4º Diagrama E-R
5º Normalização
6º Implementação
7º Testes Basicos

# Regra de Negócio
Open 


1º Um profissional só pode estar cadastrado uma vez no sistema 
2º Um profissional pode estar cadastrado em ATE 3 vagas (-)
3º Uma vaga de uma empresa pode estar cadastrada varias vez dentro do sistema 
4º Uma empresa é adiciona pode ser adiciona uma vez no sistema (CNPJ)
5º Vagas são composta por definicoes 
6º Empresas podem definir apenas 5 adequações a vagas
7º 

 


Premium

2º Um profissional pode estar cadastrado em ATE 3 vagas (-)
6º Empresas podem definir apenas 5 adequações a vagas
3º Até dois usuários (Administração /  Usuario)

# Casos de Uso 
Ilustra e descreve a funcionalidade do sistema

<img src="https://github.com/deborafsm/ds_vanilla/blob/master/Documentos_Sistema/Diagramas/RCU.PNG" width="460"/>
# Diagrama de Banco de Dados

<img src=""""/>
# Cenario Cadastrar Candidato

O usuario Loga com usuário e senha , navega pelo menu superior preenche os campos e clicando em adicionar incere um novo candidato.



<img src="https://github.com/deborafsm/ds_vanilla/blob/master/Documentos_Sistema/Telas/Cadastrar.PNG" width="600"/>


<img src="https://github.com/deborafsm/ds_vanilla/blob/master/Documentos_Sistema/Telas/CapturarCandidato.PNG" width="600"/>

# Cenario Selecionando Candidato

Clique sobre a tabela no profissional cadastrado, ou pesquise pelo nome.

<img src="https://github.com/deborafsm\ds_vanilla\Documentos_Sistema\Telas\Selecionando.PNG" width="600"/>


# Cenario Editar Candidato

O usuario Loga com o usuario e senha, navegando pelo menu superior clique no profissional cadastrado, ou pesquise pelo nome assim selecionado
editar os dados e em seguida clicar no botão Editar.

# Cenario Remover Candidato
O usuario Loga com o usuario e senha, navegando pelo menu superior clique no profissional cadastrado, ou pesquise pelo nome assim selecionado
Clique sobre Remover Usuário.


<img src="https://github.com/deborafsm/ds_vanilla/blob/master/Documentos_Sistema/Telas/Cadastrar.PNG" width="460"/>
<img src="https://github.com/deborafsm/ds_vanilla/blob/master/Documentos_Sistema/Telas/Cadastrar.PNG" width="460"/>


# Empresas 
- [x] Insert
- [x] Update
- [x] Find
- [x] Select

# Pessoas
- [x] Insert
- [ ] Update
- [x] Find
- [ ] Select

# Vagas
- [x] Insert
- [ ] Update
- [ ] Find
- [ ] Select

# Usuarios
- [x] Select

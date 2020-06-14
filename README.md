<h1 align="center">
    Consulta Receita - CNPJ
</h1>

<h4 align="center">
  Sistema desenvolvido utilizando a tecnologia Java com JAX-RS.
</h4>

<p align="center">
  <a href="#descrição">Descrição</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#Como-Usar">Como Usar</a>
</p>

## Descrição

Este projeto foi desenvolvido para realizar consultar de clientes catradas na Base de Dados com filtro através do CNPJ.
Esta API tem a finalidade de retornar os dados de clientes cadastrados na BD para ser realizado uma comparação e análise de dados alterados, podendo ser consumida por outras tecnologias.

## Tecnologias

Neste projeto foram utilizadas as seguintes tecnologias:

- [Java](https://www.java.com/pt_BR/download/faq/develop.xml)
- [Maven](https://maven.apache.org/)
- [JAX-RS](https://github.com/jax-rs)
- [Jersey](https://eclipse-ee4j.github.io/jersey/)
- [Eclipse](https://www.eclipse.org/)

## Como Usar

Para clonar e executar este aplicativo, você precisará [Git](https://git-scm.com), [Eclipse 4.15.0][https://www.eclipse.org/] ou superior instalado no seu computador. Executar no seu terminal:

```bash
# Para clonar este repositório
$ git clone https://github.com/osterloh/api-rest-consulta-cnpj-meg

# Entrar no repositório
$ cd api-rest-consulta-cnpj-meg

# Instalar as dependências
$ mvn install

#  Compilar o sistema - para listar todo os dados cadastrados
$ http://127.0.0.1:8080/meg/clientes

#  Compilar o sistema - para listar um dado específico
$ http://127.0.0.1:8080/meg/clientes/num_cnpj
```

---

Desenvolvido por [Johnatan Luiz Osterloh](https://www.linkedin.com/in/johnatanosterloh/)

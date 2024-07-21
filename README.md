# 📡 Real-Time Chat Application

Bem-vindo ao projeto **Real-Time Chat Application**! Este é um sistema de chat em tempo real desenvolvido em Java com Spring Boot. 🚀

## 📋 Índice

- [Sobre](#sobre)
- [Tecnologias](#tecnologias)
- [Instalação](#instalação)
- [Uso](#uso)
- [WebSocket e STOMP](#websocket-e-stomp)
- [Contribuição](#contribuição)
- [Licença](#licença)

## 📖 Sobre

Esta aplicação permite a comunicação em tempo real entre usuários através de uma interface de chat. Utilizamos WebSocket para a comunicação bidirecional e STOMP como protocolo de mensagem.

## 🛠️ Tecnologias

- Java
- Spring Boot
- WebSocket
- STOMP
- Maven

## 💾 Instalação

Para rodar a aplicação localmente, siga os passos abaixo:

1. Clone o repositório:
    bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    

2. Navegue até o diretório do projeto:
    bash
    cd seu-repositorio
    

3. Compile o projeto com Maven:
    bash
    mvn clean install
    

4. Execute a aplicação:
    bash
    mvn spring-boot:run
    

## 🚀 Uso

Após a instalação, você pode acessar a aplicação através do navegador no endereço:

http://localhost:8080


## 🌐 WebSocket e STOMP

### 🔄 WebSocket

WebSocket é um protocolo de comunicação que fornece canais de comunicação full-duplex sobre uma única conexão TCP. Ele é projetado para ser implementado em navegadores e servidores, permitindo que um servidor possa enviar informações para o navegador sem que ele precise fazer uma requisição para o servidor.

### 📨 STOMP

STOMP (Simple Text Oriented Messaging Protocol) é um protocolo simples e fácil de usar para trabalhar com WebSockets. Ele permite que clientes e servidores troquem mensagens de forma estruturada. No contexto do Spring Boot, ele facilita a comunicação e a organização das mensagens trocadas em um sistema de chat, por exemplo.

## 🤝 Contribuição

Contribuições são bem-vindas! Se você tiver sugestões, encontre algum problema ou quiser adicionar novos recursos, sinta-se à vontade para abrir um problema ou enviar um pull request.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.


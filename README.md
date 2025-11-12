# Monitor de Burnout
> Solução desenvolvida para a Global Solution FIAP 2025  
> Disciplina: Domain Drive Design
> 
## Integrantes: 
- João Vitor de Matos Araujo (RM559246)
- Gabriel Kato (RM)
- Gabriel Couto (RM)

---

## **Objetivo do Projeto**
O **Monitor de Burnout** é um sistema que identifica **níveis de estresse** entre funcionários e **recomenda atividades de bem-estar** com base na pontuação informada (de 0 a 10).

A proposta está alinhada aos **Objetivos de Desenvolvimento Sustentável (ODS)**, especialmente:
- **ODS 3** — Saúde e bem-estar
- **ODS 8** — Trabalho decente e crescimento econômico

---
## Estrutura do Projeto
```bash
src/com/moskitto/monitor
├── model/Funcionario.java
├── service/AvaliadorBurnout.java
├── service/MonitorBurnout.java
├── util/Ordenacao.java
├── view/MonitorGUI.java
├── Main.java
```
---
## Tecnologias Utilizadas
- Java 25
- IntelliJ IDEA
- Programação Orientada a Objetos (POO)
- Swing (Interface gráfica)
- Merge Sort (Usada também na matéria de Python)

---

## Como Executar
1. Abra o projeto no **IntelliJ IDEA**.
2. Execute a classe:
   com.moskitto.monitor.view.MonitorGUI
3. Clique em **“Gerar Relatório”** para visualizar os níveis de burnout e recomendações na interface.

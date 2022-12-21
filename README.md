# aluno_CM_1704487
nome: rodrigo silva
numero: 1704487
curso: Comunicação Multimédia

redbull racing

![alt text](./imagens/Campus_IPG_1.jpg)


branch auxiliar


26 de setembro de 2022


# nome do projecto
F1 Showcase
## 1. Descrição do Trabalho
Aplicação focada em mostrar os aspetos visuais dos carros de Formula 1 de 2022 (10 equipas). Para cada um delas, foi criada uma activity onde demonstre os carros e um respetivo briefing.

Foi implementado também um menu hambúrguer funcional com acesso à galeria de equipas (Teams) e sobre a aplicação (About).

## 2. Activities Criadas
    Main Screen
![alt text](./imagens/F1ShowcaseActivity/main.png)

    Navigation Drawer
![alt text](./imagens/F1ShowcaseActivity/Navigation_drawer.png)

    Team screen (é o mesmo para todas as equipas)
![alt text](./imagens/F1ShowcaseActivity/Team_screen.png)

    Teams fragment
![alt text](./imagens/F1ShowcaseActivity/team_fragment.png)

    About Fragment
![alt text](./imagens/F1ShowcaseActivity/about_fragment.png)
## 3. Navegação entre as activities
A navegação entre activities dá-se da seguinte forma.
A activity “Team screen” simboliza todas as equipas
![alt text](./imagens/activities.png)
## 4. Trabalho nas Interfaces
Landing screen:
ImageView de um drawable;
Button para aceder ao ecrã principal;
TextView para indicar a versão da aplicação.

	Main screen:
Implementação de um GridLayout com CardViews;
Cada CardView tem uma imagem e um texto associados, compostos numa RelativeLayout;
As CardView possuem onClick para serem clicáveis;
Associação de uma Navigation Drawer.

	Team screen:
TextView descritivo do nome da equipa;
ImageView com o carro respetivo da equipa;
TextView;
TextView com largura de 350dp para estruturar o texto.

	Drawer screen:
Possui um drawer header que mostre a ImageView;
Possui itens clicáveis que criam a interação entre os fragmentos compostos na navigation drawer.

	About screen:
Apenas composto por textView. Títulos estão em bold.

## 5. Assets do trabalho escolhidos

    Carros:
![alt text](./imagens/F1ShowcaseAssets/cars/AF22.png)
![alt text](./imagens/F1ShowcaseAssets/cars/RBR.png)
![alt text](./imagens/F1ShowcaseAssets/cars/ALPINE.png)
![alt text](./imagens/F1ShowcaseAssets/cars/AM22.png)
![alt text](./imagens/F1ShowcaseAssets/cars/AF22.png)
![alt text](./imagens/F1ShowcaseAssets/cars/WILLIAMS22.png)
![alt text](./imagens/F1ShowcaseAssets/cars/W13.png)
![alt text](./imagens/F1ShowcaseAssets/cars/FSF75.png)
![alt text](./imagens/F1ShowcaseAssets/cars/HAAS22.png)
![alt text](./imagens/F1ShowcaseAssets/cars/MCLAREN.png)

    Ícones das equipas
![alt text](./imagens/F1ShowcaseAssets/teamLogo/alfa_romeo.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/alp.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/alphatauri.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/aston_martin.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/ferrari.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/haas.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/mclaren.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/merc.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/rbr.png)
![alt text](./imagens/F1ShowcaseAssets/teamLogo/williams.png)

    Imagens para a app
![alt text](./imagens/F1ShowcaseAssets/app_icon.png)
![alt text](./imagens/F1ShowcaseAssets/Vertical%20dark.png)


## 6. Assets usados no trabalho
![alt text](./imagens/F1ShowcaseAssets/app_icon.png)
![alt text](./imagens/F1ShowcaseAssets/Vertical%20dark.png)
## 7. Conclusão
O projeto correu de acordo com o planeado na definição do mesmo.


Criação gráfica do logótipo (.svg e .png);
Aquisição de imagens e conteúdo para a descrição das equipas e carros;
Desenho das várias janelas da interface e a sua relação entre si + cálculo das Activities necessárias;
Criação das Activities;


## 8. Bibliografia

[F1 Racing Teams 2022 - Ferrari, Mercedes, Red Bull and more (formula1.com)](https://www.formula1.com/en/teams.html)
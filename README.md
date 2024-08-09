# Laboratorium

## Zadanie 1.
Zdefiniuj klasę Style o finalnych, publicznych polach klasy String: fillColor, strokeColor oraz Double: strokeWidth. Napisz trójargumentowy konstruktor ustawiający te wartości. Napisz publiczną metodę toSvg() zwracającą napis, będący opcją style, którą można umieścić np. w tagu <polygon>.
Zmodyfikuj klasę Polygon dodając do jej konstruktora argument Style i modyfikując jej metodę toSvg(), aby uwzględniała styl. Dopuść możliwość pominięcia stylu przy konstrukcji. Wówczas należy narysować przezroczysty (fillColor) wielokąt, z czarnym obrysem (strokeColor) o grubości jednego piksela (strokeWidth).

## Zadanie 2.
Napisz klasę SvgScene posiadającą prywatną listę obiektów Polygon. Napisz metodę, która przyjmuje obiekt klasy Polygon oraz dodaje go do listy w obiekcie SvgScene. Napisz funkcję save(String), która utworzy plik HTML w ścieżce danej argumentem i zapisze do niego reprezentacje wszystkich wielokątów znajdujących się na kanwie. 

## Zadanie 3.
Napisz publiczną, statyczną metodę wytwórczą klasy Polygon o nazwie square. Funkcja powinna przyjąć jako argumenty: obiekt Line, obiekt Style i zwrócić wielokąt będący kwadratem, którego przekątną jest dany odcinek.
Przeciąż metodę klasy Line zwracającą prostopadły odcinek tak, aby przyjmowała jako dodatkowy argument długość zwracanego odcinka.

## Zadanie 4a.
Utwórz klasę abstrakcyjną Shape, która otrzyma jako pole, obiekt klasy Style. Uczyń pole tego obiektu chronionym. Utwórz publiczny konstruktor, który ustawia to pole. Napisz abstrakcyjną metodę toSvg(). Zmodyfikuj klasę Polygon, aby dziedziczyła po klasie Shape.

## Zadanie 4b.
Napisz klasę Ellipse dziedziczącą po Shape, posiadającą prywatne pola: środek elipsy (Point), długości promieni i styl. W jej implementacji metody toSvg() powinno znaleźć się rysowanie z użyciem tagu <ellipse>.
Zmodyfikuj klasę SvgScene, aby posiadała tablicę obiektów klasy Shape i korzystając z polimorfizmu zapisz w niej obiekty typu Polygon i Ellipse.

/*6. Камни. Определить иерархию драгоценных и полудрагоценных камней.
Отобрать камни для ожерелья. Подсчитать общий вес (в каратах) и стоимость.
Провести сортировку камней ожерелья на основе ценности.
Найти камни в ожерелье, соответствующие заданному диапазону параметров прозрачности.*/


import java.io.Serializable;

public abstract class Stone implements GetSet, Comparable<Stone>, Serializable {
    public double weight;
    public double price;
    public double alpha;



    @Override
    public int compareTo(Stone o) {
        return (int) (o.getPrice() - this.getPrice());
    }


}

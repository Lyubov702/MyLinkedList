# MyLinkedList

Сравнение производительности коллекций

Рассматрим ArrayList и LinkedList.
В каждый лист было добавлено 10000 элементов Employee.
Видим, что общее время работы у массива меньше, чем у списка.
Считалось, что недостатки ArrayList проявляются при вставке/удалении элемента в середине списка
— это взывает перезапись всех элементов размещенных «правее» в списке на одну позицию влево, кроме того,
при удалении элементов размер массива не уменьшается.
Здесь же мы видим, что добавление/удаление в/из середину элемента у ArrayList происходит быстрее.

_________add element_________
Add time of  ArrayList is equal  2050100
Add time of  LinkedList is equal 1709400
_________add element by index_________
Add time of  ArrayList is equal  31200
Add time of  LinkedList is equal 107400
_________remove element_________
Remove time of  ArrayList is equal  575800
Remove time of  LinkedList is equal 634400
_________set element_________
Set time of  ArrayList is equal  1623600
Set time of  LinkedList is equal 57282900
_________clear list_________
Clear time of  ArrayList is equal  217700
Clear time of  LinkedList is equal 260100

Total operating time of arrayList= 2572600
Total operating time of linkedList= 65487900


Перейдем к HashMap, LinkedHashMap, TreeMap.
Можно заметить, что самое долгое время добавления элементов в конец,
проверка на содержание элемента и удаление эдемента из середины  у TreeMap, что можно объяснить тем,
что он обеспечивает упорядоченно хранение элементов в виде красно-черного дерева.
Но благодаря этому удаление данного множества самое быстрое.
Наиболее быстрое время выполнения для добавления элемена в конец, проверка на содержание элемента
и удаления по ключу у LinkedHashMap.
Добавление элементов в коллекцию у LinkedHashMap и HashMap отличается не сильно, но все же HashMap уступает.

____________________add element_________________________
Add time of  HashMap is equal              7107200
Add time of  LinkedHashMap is equal        6548000
Add time of  TreeMap is equal              12191900
__________________contains element______________________
time of  HashMap is equal                  83700
time of  LinkedHashMap is equal            3400
time of  TreeMap is equal                  64500
__________________remove element__________________________
Remove time of  HashMap is equal          21700
Remove time of  LinkedHashMap is equal    5800
Remove time of  TreeMap is equal          55200
__________________clear map__________________________
Remove time of  HashMap is equal          978100
Remove time of  LinkedHashMap is equal    408900
Remove time of  TreeMap is equal          4600

Рассмотрим производительность HashSet, LinkedHashSet и TreeSet.
Как можно заметить, добавление элемента происходит быстрее у LinkedHashSet.
При выполнении  проверки на содержания ключа и  удаления самое быстрое время показывает реализация LinkedHashSet, как и ранее.
LinkedHashSet представляет собой связный список элементов набора в том порядке, в котором они вставлялись. 
Это позволяет организовать упорядоченную итерацию вставки в набор.
Самое быстрое время удаления множества у TreeSet.

_________add element_________
Add time of  HashSet is equal       7578700
Add time of  LinkedHashSet is equal 5062400
Add time of  TreeSet is equal       13605600
_________contains element_________
time of  HashSet is equal       200800
time of  LinkedHashSet is equal 5100
time of  TreeSet is equal       81900
_________remove element_________
Remove time of  HashSet is equal       29800
Remove time of  LinkedHashSet is equal 7700
Remove time of  TreeSet is equal       65000
_________clear set_________
Remove time of  HashSet is equal       592700
Remove time of  LinkedHashSet is equal 589800
Remove time of  TreeSet is equal       13000

package com.mudr1k.task20211130;

/*
дано
node1 -> node2 -> ... -> nodeN

вернуть
nodeN -> nodeN-1 ->... -> node1
 */


public class TaskNodeReverse {

    public static Node currResult = null;

    private static class Node {
        Node next;
        int element;

        private Node(int element, Node next) {
            this.next = next;
            this.element = element;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", element=" + element +
                    '}';
        }
    }

    public static void reverse(Node node) {
        /*
        - берём входящий нод и пока он не закончится крутим в цикле, а именно:
        - временно сохраняем отдельно ссылку на следующий элемент входящего нода (соответственно на весь последующий хвост)
        - у входящего нода по сути отрезаем только что временно сохранённую часть, присваивая ссылку на текущий результат
        - обновляем текущий результат, добавляя в него ссылку на отрезанный элемент входящего нода
        - обновляем входящий нод, возвращая в него тот остаток который временно сохраняли и идём на следующую итерацию

        итого получается на старте:
        node:           1 -> 2 -> 3 -> null
        currResult:     null
        -------------------------------- 1 круг
        restOfTheList:  2 -> 3 -> null
        node:           1 -> null
        currResult:     1 -> null
        node:           2 -> 3 -> null
        -------------------------------- 2 круг
        restOfTheList:  3 -> null
        node:           2 -> 1 -> null
        currResult:     2 -> 1 -> null
        node:           3 -> null
        -------------------------------- 3 круг
        restOfTheList:  null
        node:           3 -> 2 -> 1 -> null
        currResult:     3 -> 2 -> 1 -> null
        node:           null

        финиш

         */
        while (node != null) {
            Node restOfTheList = node.next;
            node.next = currResult;
            currResult = node;
            node = restOfTheList;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1, new Node(2, new Node(3, null)));
        System.out.println(node);

        reverse(node);
        System.out.println(currResult);
    }
}

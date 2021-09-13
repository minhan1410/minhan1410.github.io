package vn.techmaster;

public final class App {
    private App() {
    }

    static void differentWaysToLoopAList() {
        DemoList demoList = new DemoList();
        demoList.simpleForLoop();

        demoList.enhanceForLoop();

        demoList.iteratorLoop();

        demoList.listIteratorLoop();

        demoList.listIteratorBackward();

        demoList.whileLoop();

        demoList.forEachLoopA();

        demoList.forEachLoopB();

        demoList.streamForEach();
    }

    static void aListCanAcceptAnyType() {
        AnyTypeList anyTypeList = new AnyTypeList();
        anyTypeList.listItemAndType();
    }

    static void removeItemFromList() {
        RemoveItemFromList rmItemFromLst = new RemoveItemFromList();
        //rmItemFromLst.removeOddNumbersBuggy();
        //rmItemFromLst.removeOddNumbers();
        //rmItemFromLst.removeIfOddNumbers();
        rmItemFromLst.removeOddNumbersIterator();
        rmItemFromLst.clearAllItems();

    }

    static void sortList() {
        SortList sList = new SortList();
        sList.sortListSimple();
    }

    static void customSort() {
        CustomSort s = new CustomSort();
        s.sort();
    }

    static void demoHashSet() {
        DemoHashSet hs = new DemoHashSet();
    }

    public static void main(String[] args) {
        // differentWaysToLoopAList();
        
        // aListCanAcceptAnyType();

        // removeItemFromList();

        // sortList();

        // customSort();
        int i;
        System.out.println(i);

        //demoHashSet();
    }
}

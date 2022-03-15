package interfaces;

import interfaces.NestedInterface.InnerNestedInterface;

public class NestedInterface {
    private String cName;

    /**
     * InnerNestedInterface
     */
    public void setCname(String str) {
        cName = str;
    }

    public String getCname() {
        return cName;
    }

    public interface InnerNestedInterface {
        int i = 10;

        void show();
    }
}

class NestedMain implements NestedInterface.InnerNestedInterface {
    @Override
    public void show() {
        System.out.println("This is from Nested Interface");
    }

    public int getNumber() {
        return NestedInterface.InnerNestedInterface.i;
    }

    public static void main(String[] args) {
        try {
            NestedInterface.InnerNestedInterface obj = new NestedMain();
            obj.show();
            NestedInterface niObj = new NestedInterface();
            niObj.setCname("HI!");
            System.out.println(niObj.getCname());
            // Here we get run time error.
            try {
                NestedInterface.InnerNestedInterface obj2 = (InnerNestedInterface) new NestedInterface();
                obj2.show();
            } catch (ClassCastException e) {
                System.out.println("ClassCastException : " + e);
            }
            InnerNestedInterface obj3 = new InnerNestedInterface() {
                @Override
                public void show() {
                    System.out.println("This is from  obj 3");
                }
            };
            obj3.show();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}

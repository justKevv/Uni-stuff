package org.example;

public class SearchStudent {
    Students[] listStd = new Students[15];
    int idx = 0;

    void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("List is full");
        }
    }

    void display() {
        for (Students std : listStd) {
            std.display();
        }
    }

    int findSeqSearch(int search) {
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                return i;
            }
        }
        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos == -1) {
            System.out.println("Data: " + x + " is not found");
        } else {
            System.out.println("Data: "+x + " is found at position " + pos);
        }
    }

    void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : "+ x);
            System.out.println("Name \t : "+ listStd[pos].name);
            System.out.println("Age \t : "+ listStd[pos].age);
            System.out.println("GPA \t : "+ listStd[pos].gpa);
        } else {
            System.out.println("Data: " + x + " is not found");
        }
    }
}

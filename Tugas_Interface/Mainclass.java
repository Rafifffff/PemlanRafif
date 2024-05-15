package Tugas_Interface;

public class Mainclass {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Buku Tulis", 5, 10);
        Invoice invoice2 = new Invoice("Kertas HVS", 1, 200);
        Invoice invoice3 = new Invoice("Pensil", 10, 5);   
        Invoice invoice4 = new Invoice("Penghapus", 2, 10);
        Invoice invoice5 = new Invoice("Penggaris", 1, 50);

        Invoice[] invoices = {invoice1, invoice2, invoice3, invoice4, invoice5};

        Employee employee = new Employee(235150, "Rafif Rantisi", 1500, invoices);

        employee.displayEmployeeInfo();

    }
}


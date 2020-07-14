import java.util.ArrayList;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/
public class Task05 {
    public static void main(String[] args) {
        TourAggregator dreamTour = new TourAggregator("DREAN TOUR");
        Client client = new Client("Ivan", "Lukashin", 500.20);

        dreamTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 12, 1099.99));
        dreamTour.addTourPackage(new TourPackage("Spain", "Salou", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.ALL_INCLUSIVE, 14, 1699.89));
        dreamTour.addTourPackage(new TourPackage("Spain", "Madrid", TourPackageType.EXCURSION,
                Transport.BUS, TypeOfFood.DINNER, 5, 400.10));
        dreamTour.addTourPackage(new TourPackage("Spain", "Malaga", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.BREAKFAST, 15, 1400.20));
        dreamTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.TREATMENT,
                Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 8, 500.80));

        System.out.println("Select by excursion:");
        ArrayList<TourPackage> selectByType = dreamTour.selectByTourPackageType(TourPackageType.EXCURSION);
        TourAggregator.printTours(selectByType);

        System.out.println("\nSelect by ship:");
        ArrayList<TourPackage> selectByOption = dreamTour.selectByMoreOption(Transport.SHIP);
        TourAggregator.sortByNumberOfDays(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by plane and breakfast:");
        selectByOption = dreamTour.selectByMoreOption(Transport.PLANE, TypeOfFood.BREAKFAST);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 7 days:");
        selectByOption = dreamTour.selectByMoreOption(Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 7);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 8 days:");
        selectByOption = dreamTour.selectByMoreOption(Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 8);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect for 5 days:");
        selectByOption = dreamTour.selectByMoreOption(5);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        dreamTour.addClient(client, selectByOption.get(0));
    }
}



import entity.DragonCave;
import logic.DragonCaveLogic;
import view.View;

public class Main {
    public static void main(String[] args) {
        DragonCave cave = new DragonCave();
        DragonCaveLogic caveLogic = new DragonCaveLogic();
        View view = new View();
        caveLogic.addTreasure(cave);
        view.viewAllTreasure(cave.getListOfTreasure());
        System.out.println("-----------------------------");
        view.viewTreasure(caveLogic.searchExpensiveTreasure(cave));
        System.out.println("-----------------------------");
        view.viewAllTreasure(caveLogic.buySomeTreasure(1200,cave));

    }
}

public class OnlinePurchaseManager {

    public int countElectronicsByMaker(String maker) {
        int count = 0;
        for (int i = 0; i < purchases.size(); i++) {
            if((purchases.get(i).isElectronic && (purchases.get(i).getMaker() == maker) {
            count++;
        }
    }
    return count;
}

public boolean hasAdjacentEqualPair() {
        if (purchases.size() < 2) {
            return false
        }

        for (int i = 0; i < purchases.size(); i++) {
            if((purchases.get(i)).equals(purchases.get(i + 1)) {
            return true;
        }
    }
    return false;
}

public Gizmo getCheapestGizmoByMaker() {
        //In order to improve the programs efficiency to calculate the cheapest item from a specific seller,
        //I would create a variable per purchaser and create an Integer Variable named cheapest and make it equal to the cheapest item they bought.
    }

}


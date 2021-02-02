import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        for(IReviewed iReviewed: attractions){
            allReviewed.add(iReviewed);
        }
        for(IReviewed iReviewed:stalls){
            allReviewed.add(iReviewed);
        }
        return allReviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        visitor.visitAttraction(attraction);
        attraction.setVisitCount(1);
    }
}

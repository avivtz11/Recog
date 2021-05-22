package com.example.recog;

import java.util.ArrayList;

/**
 * Created by Aviv & Liraz on 17/08/2017.
 */

public class Picture {
    private ArrayList<String> possNames = new ArrayList<>();
    private int drawId;
    private boolean isSolved = false;
    private String kind;

    public Picture(String possName, int drawId, String kind) {
        this.possNames.add(possName);
        this.drawId = drawId;
        this.kind = kind;
    }

    public Picture(ArrayList<String> possNames, int drawId, String kind) {
        this.possNames = (ArrayList<String>)(possNames.clone());
        this.drawId = drawId;
        this.kind = kind;
    }

    public Picture(Picture other) {
        this(other.getPossNames(),other.getDrawId(), other.kind);
    }

    public String getKind() {
        return new String(kind);
    }

    public int getDrawId() {
        return drawId;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setDrawId(int drawId) {
        this.drawId = drawId;
    }

    public ArrayList<String> getPossNames() {
        return (ArrayList<String>)(possNames.clone());
    }

    public void addName(String possName){
        if(!isPossName(possName))
            this.possNames.add(possName);
    }

    public void removeName(String remPossName){
        this.possNames.remove(remPossName);
    }

    public boolean isPossName(String possName){
        return(this.possNames.contains(possName));
    }

    @Override
    protected Object clone() {
        return (new Picture(this.getPossNames(),this.getDrawId(), this.kind));
    }
}

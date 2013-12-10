package ua.kpi.campus.api.jsonparsers;

/**
 * Created with IntelliJ IDEA.
 * User: Serhii Hokhalenko
 * Date: 11.12.13
 * Time: 0:07
 * To change this template use File | Settings | File Templates.
 */
public final class Personality {
    private final  int subdivisionID;
    private final  String subdivisionName;
    private final String studyGroupName;
    private  final boolean isContract;
    private final String speciality;

    public Personality(int subdivisionID, String subdivisionName, String studyGroupName, boolean contract, String speciality) {
        this.subdivisionID = subdivisionID;
        this.subdivisionName = subdivisionName;
        this.studyGroupName = studyGroupName;
        isContract = contract;
        this.speciality = speciality;
    }
}

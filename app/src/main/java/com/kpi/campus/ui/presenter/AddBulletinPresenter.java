package com.kpi.campus.ui.presenter;

import com.kpi.campus.model.pojo.Bulletin;
import com.kpi.campus.model.pojo.Item;
import com.kpi.campus.model.pojo.User;
import com.kpi.campus.rx.BulletinRxLoader;

import java.util.List;

import javax.inject.Inject;

/**
 * AddBulletinPresenter created to manage AddBulletinActivity.
 * <p>
 * Created by Admin on 12.02.2016.
 */
public class AddBulletinPresenter extends BasePresenter {

    private IView mView;
    private BulletinRxLoader mLoader;

    @Inject
    public AddBulletinPresenter() {
        mLoader = new BulletinRxLoader(this);
    }

    @Override
    public void initializeViewComponent() {
        mView.setViewComponent();
        loadSpinnerAdapterData();
    }

    public void setView(IView view) {
        mView = view;
    }

    public void loadGroupsInSubdiv(String subdivId) {
        mLoader.loadGroupsIn(subdivId);
    }

    public void onStartRequest() {
        mView.showProgressDialog();

        addBulletin();
    }

    public void onFinishRequest(int responseCode, String responseMsg) {
        mView.dismissProgressDialog();
        mView.showResponse(responseCode, responseMsg);
    }

    public void setDescSubdivisions(List<Item> list) {
        mView.setSubdivisionAdapter(list);
    }

    public void setProfiles(List<Item> list) {
        mView.setProfileAdapter(list);
    }

    public void setGroups(List<Item> list) {
        mView.setGroupAdapter(list);
    }

    private void loadSpinnerAdapterData() {
        List<Item> subdivisions = User.getInstance().subdivision;
        if (subdivisions != null && !subdivisions.isEmpty()) {
            Item mainSubdiv = subdivisions.get(0);
            mLoader.loadDescSubdivisions(mainSubdiv.getId().toString());
            mLoader.loadGroupsIn(mainSubdiv.getId().toString());
        }
        mLoader.loadProfiles();
    }

    private void addBulletin() {
        Bulletin newBulletin = mView.createBulletin();
        mLoader.addBulletin(newBulletin);
    }

    public interface IView {
        void setViewComponent();

        void showProgressDialog();

        void dismissProgressDialog();

        void showResponse(int code, String msg);

        Bulletin createBulletin();

        void setSubdivisionAdapter(List<Item> list);

        void setProfileAdapter(List<Item> list);

        void setGroupAdapter(List<Item> list);

        void updateBadgeCounter(int count);
    }
}

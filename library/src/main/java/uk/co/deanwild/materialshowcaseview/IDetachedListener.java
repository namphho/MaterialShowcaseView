package uk.co.deanwild.materialshowcaseview;


public interface IDetachedListener {
    void onShowcaseDetached(MaterialShowcaseView showcaseView, boolean wasDismissed, boolean wasSkipped);
    void onShowcaseDetached(MaterialShowcaseViewWithImage showcaseView, boolean wasDismissed, boolean wasSkipped);
}

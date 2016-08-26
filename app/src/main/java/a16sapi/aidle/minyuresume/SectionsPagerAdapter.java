package a16sapi.aidle.minyuresume;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Pureblue on 8/25/16.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    final int countPage = 5;
    //rivate String tabNames[] = new String[]{"Home", "Education", "Experience", "Skill", "Reference"};

    public SectionsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
    }

    @Override
    public int getCount() {
        return countPage; // # of tabs
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new HomeActivity();
            case 1:
                return new EducationActivity();
            case 2:
                return new ExperienceActivity();
            case 3:
                return new SkillActivity();
            case 4:
                return new ReferenceActivity();
            default:
                return null;
        }
    }
    /*@Override
    public CharSequence getPageTitle(int position) {
        return tabNames[position];
    }*/
}

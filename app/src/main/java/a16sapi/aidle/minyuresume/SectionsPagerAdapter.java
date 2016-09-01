package a16sapi.aidle.minyuresume;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * It renders several fragments to link each other
 *
 * Created by Pureblue on 8/25/16.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    final int countPage = 5;

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
                return new HomeFragment();
            case 1:
                return new EducationFragment();
            case 2:
                return new ExperienceFragment();
            case 3:
                return new SkillFragment();
            case 4:
                return new ReferenceFragment();
            default:
                return null;
        }
    }
}

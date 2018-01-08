/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.miwok.data.Word;
import com.example.android.miwok.data.WordsDataHelper;

import java.util.ArrayList;

import static com.example.android.miwok.WordsListFragment.CATEGORY_COLOR_KEY;
import static com.example.android.miwok.WordsListFragment.WORDS_KEY;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class WordsFragmentPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments;
    private String[] tabTitles;

    public WordsFragmentPagerAdapter(FragmentManager fm) {
        super(fm);

        fragments = new Fragment[]{
                createFragment(WordsDataHelper.getNUMBERS(), R.color.category_numbers),
                createFragment(WordsDataHelper.getFAMILY(), R.color.category_family),
                createFragment(WordsDataHelper.getCOLORS(), R.color.category_colors),
                createFragment(WordsDataHelper.getPHRASES(), R.color.category_phrases)
        };

        tabTitles = new String[]{"Numbers", "Family", "Colors", "Phrases"};
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    private Fragment createFragment(ArrayList<Word> wordList, int colorId) {
        WordsListFragment wordsListFragment = new WordsListFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(WORDS_KEY, wordList);
        bundle.putInt(CATEGORY_COLOR_KEY, colorId);
        wordsListFragment.setArguments(bundle);
        return wordsListFragment;
    }
}

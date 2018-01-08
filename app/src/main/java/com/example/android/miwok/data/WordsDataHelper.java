package com.example.android.miwok.data;

import com.example.android.miwok.R;

import java.util.ArrayList;

/**
 * @author Andrey Radionov
 */

public class WordsDataHelper {
    private static final ArrayList<Word> COLORS = new ArrayList<>();
    private static final ArrayList<Word> FAMILY = new ArrayList<>();
    private static final ArrayList<Word> NUMBERS = new ArrayList<>();
    private static final ArrayList<Word> PHRASES = new ArrayList<>();

    private WordsDataHelper() {
    }

    static {
        initColors();
        initFamily();
        initNumbers();
        initPhrases();
    }

    public static ArrayList<Word> getCOLORS() {
        return COLORS;
    }

    public static ArrayList<Word> getFAMILY() {
        return FAMILY;
    }

    public static ArrayList<Word> getNUMBERS() {
        return NUMBERS;
    }

    public static ArrayList<Word> getPHRASES() {
        return PHRASES;
    }

    private static void initColors() {
        COLORS.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        COLORS.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        COLORS.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        COLORS.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        COLORS.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        COLORS.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        COLORS.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        COLORS.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
    }

    private static void initFamily() {
        FAMILY.add(new Word("father", "әpә", R.drawable.family_father, R.raw.family_father));
        FAMILY.add(new Word("mother", "әṭa", R.drawable.family_mother, R.raw.family_mother));
        FAMILY.add(new Word("son", "angsi", R.drawable.family_son, R.raw.family_son));
        FAMILY.add(new Word("daughter", "tune", R.drawable.family_daughter, R.raw.family_daughter));
        FAMILY.add(new Word("older brother", "taachi", R.drawable.family_older_brother, R.raw.family_older_brother));
        FAMILY.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        FAMILY.add(new Word("older sister", "teṭe", R.drawable.family_older_sister, R.raw.family_older_sister));
        FAMILY.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        FAMILY.add(new Word("grandfather", "paapa", R.drawable.family_grandfather, R.raw.family_grandfather));
        FAMILY.add(new Word("grandmother", "ama", R.drawable.family_grandmother, R.raw.family_grandmother));
    }

    private static void initNumbers() {
        NUMBERS.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        NUMBERS.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        NUMBERS.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        NUMBERS.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        NUMBERS.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        NUMBERS.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        NUMBERS.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        NUMBERS.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        NUMBERS.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        NUMBERS.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));
    }

    private static void initPhrases() {
        PHRASES.add(new Word("Where are you going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        PHRASES.add(new Word("What is your name?", "tinnә oyaase'nә", R.raw.phrase_what_is_your_name));
        PHRASES.add(new Word("My name is...", "oyaaset...", R.raw.phrase_my_name_is));
        PHRASES.add(new Word("How are you feeling?", "michәksәs?", R.raw.phrase_how_are_you_feeling));
        PHRASES.add(new Word("I’m feeling good.", "kuchi achit", R.raw.phrase_im_feeling_good));
        PHRASES.add(new Word("Are you coming?", "әәnәs'aa?", R.raw.phrase_are_you_coming));
        PHRASES.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.raw.phrase_yes_im_coming));
        PHRASES.add(new Word("I’m coming.", "әәnәm", R.raw.phrase_im_coming));
        PHRASES.add(new Word("Let’s go.", "yoowutis", R.raw.phrase_lets_go));
        PHRASES.add(new Word("Come here.", "әnni'nem", R.raw.phrase_come_here));
    }
}

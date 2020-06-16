package com.example.thepersonalpsychiatrist;

public class Questions {

    public String mQuestions[] = {

            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",
            "Please Select one of These",

    };
    public String mChoices[][]={
        {"I do not feel sad.",
                "I feel sad.",
                "I am sad all the time and can’t snap out of it.",
                "I am so sad or unhappy that I cannot stand it."},
            {"I am not particularly discouraged about the future.",
                    "I feel discouraged about the future.",
                    "I feel I have nothing to look forward to.",
                    "I feel that the future is hopeless and that things cannot improve."},
            {"I do not feel like a failure ",
                    "I feel I have failed more than the average person.",
                    "As I look back on my life, all I can see is a lot of failure.",
                    "I feel I am a complete failure as a person. "},
            {"I get as much satisfaction out of things as I used to",
                    "I don’t enjoy things the way I used to.",
                    "I don’t get any real satisfaction out of anything anymore",
                    "I am dissatisfied or bored with everything"},
            {"I don’t feel particularly guilty.",
                    "I feel guilty a good part of the time.",
                    "I feel guilty most of the time.",
                    "I feel guilty all the time."},
            {"I don’t feel that I am being punished.",
                    "I feel I may be punished.",
                    "I expected to be punished.",
                    "I feel I am being punished."},

            {"I don’t feel disappointed in myself.",
                    "I am disappointed in myself",
                    "I am disgusted with myself.",
                    "I hate myself"},

            {"I don’t feel I am worse than anybody else.",
                    "I am critical of myself for my weaknesses or mistakes",
                    "I blame myself all the time for faults.",
                    "I blame myself for everything bad that happens"},

            {"I don’t have any thoughts of killing myself",
                    "I have thoughts of killing myself but I would not carry them out.",
                    "I would like to kill myself.",
                    "I would kill myself if I had the chance."},

            {"I am not more irritated by things than I ever am.",
                    "I am slightly more irritated now than usual.",
                    "I am quite annoyed or irritated a good deal of the time.",
                    "I feel irritated all the time now."},
            {"I have not lost interest in other people",
                    "I am less interested in other people than I used to be.",
                    "I have lost most of my interest in other people.",
                    "I have lost all my interest in other people."},

            {"I make decisions about as well as I ever could.",
                    "I put off making decisions more than I used to.",
                    "I have a greater difficulty in making decisions than before.",
                    "I can’t make decisions at all anymore. "},

            {"I don’t feel I look any worse than I used to.",
                    "I am worried that I am looking old or unattractive.",
                    "I feel that there are permanent changes in my appearance that make me look unattractive",
                    "I believe that I look ugly."},

            {"I can work about as well as before.",
                    "It takes an extra effort to get started at doing something.",
                    "I have to push myself very hard to do anything.",
                    "I can’t do any work at all."},

            {"I can sleep as well as usual.",
                    "I don’t sleep as well as I used to.",
                    "I wake up 1-2 hours earlier than usual and find it hard to get back to sleep.",
                    "I wake up several hours earlier than I used to and cannot get back to sleep."},

            {"I don’t get more tired than usual.",
                    "I get tired more easily than I used to..",
                    "I get tired from doing almost anything.",
                    "I am too tired to do anything"},

            {"My appetite is no worse than usual",
                    "My appetite is not as good as it used to be",
                    "My appetite is much worse now.",
                    "I have no appetite at all anymore."},

            {"I haven’t lost much weight, if any, lately.",
                    "I have lost more than five pounds",
                    "I have lost more than ten pounds",
                    "I have lost more than fifteen pounds trying to lose weight.\n" +
                            "Score 0 if you have been purposely trying to lose weight.\n"},


            {"I am no more worried about my health than usual.",
                    "I am worried about my physical problems such as aches and pains or upset stomach",
                    "I am very worried about physical problems and it’s hard to think of much else.",
                    "I am so worried about my physical problems that I cannot think about anything else. "},


    };

    public String getQuestions(int a){

        String question = mQuestions[a];
        return question;
    }
    public String getChoices1(int a){

        String choice =mChoices[a][0];
        return choice;
    }
    public String getChoices2(int a){

        String choice =mChoices[a][1];
        return choice;
    }
    public String getChoices3(int a){

        String choice =mChoices[a][2];
        return choice;
    }
    public String getChoices4(int a){

        String choice =mChoices[a][3];
        return choice;
    }
}
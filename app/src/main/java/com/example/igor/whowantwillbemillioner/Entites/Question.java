package com.example.igor.whowantwillbemillioner.Entites;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {


    private int id;
    private String questionText;
    private String[] answer;
    private int trueAnswer;
    private String description;

    private static final ArrayList<Question> questions = new ArrayList<>(Arrays.asList(new Question(0, "Что является лишним в ряду?", new String[]{"Лувр","Колизей", "Эрмитаж", "Третьяковская галерея"}, 1, "Колизей является памятником архитектуры. Все остальные сооружения – ныне действующие музеи"),
            new Question(1, "Что является лишним в ряду?", new String[]{"Дорический", "Коринфский","Ионический", "спартанский"}, 3, "Дорический, коринфский, ионический – древнегреческие ордера колон"),
            new Question(2, "Самый длительный период истории человечества и его культуры:", new String[]{"Каменный век", "Античность","Средние века", "Возрождение"}, 0, "Каменный век длился более двух миллионов лет, это самая большая часть нашей истории"),
            new Question(3, "Характерные особенности этого стиля стрельчатые арки, огромные окна и витражи", new String[]{"Романский стиль", "Готический стиль","Барокко", "Классицизм"}, 1, "Готика –это огромные окна, многоцветные витражи, световые эффекты. Гигантские ажурные башни, подчеркнутая вертикальность всех конструктивных элементов."),
            new Question(4, "Этот стиль в переводе означает «причудливый, вычурный»", new String[]{"Готический", "Ампир","Модерн", "Барокко"}, 3, "Барокко - это стиль в искусстве вообще и архитектуре в частности.Родиной этого стиля принято считать некоторые итальянские города: Рим, Венецию и Флоренцию."),
            new Question(5, "Кто является выдающимся собирателем русской живописи", new String[]{"П. Третьяков", "С. Мамонтов","П. Рябушинский", "Е. Лансере"}, 0, "Павел Третьяков - основатель Третьяковской галереи. Третьяковка стала первой свободной для посещения галереей. В этом музее были собраны самые ценные для России произведения. "),
            new Question(6, "Отличительной чертой греческого скульптурного изображения является:", new String[]{"передача портретных сходств модели", "идеализация (каноничность) образа","исполнение в дереве", "изображение богов"},1 , "Древнегреческие скульпторы в своих работах изображали образ идеального человека, подобного богам."),
            new Question(7, "Кто из художников написал картину «Рождение Венеры»?", new String[]{"Леонардо да Винчи", "Караваджо","Сандро Боттичелли", "Перуджино"}, 2, "Сандро Боттичелли в образе Богини любви и красоты – Венеры изобразил одну из знатнейших и красивейших дам своего времени. "),
            //new Question(8, "Самый длительный период истории человечества и его культуры:", new String[]{"1531","1345", "1242", "1234"}, 0, "Колизей является памятником архитектуры. Все остальные сооружения – ныне действующие музеи"),
            new Question(9, "Какие персонажи мифов связаны с Кносским дворцом?", new String[]{"Орфей и Эвридика","Персей и Андромеда", "Тесей и Минотавр", "Одисей и Аргонавты"}, 2, "Дворец царя Миноса — место действия самого красивого из мифов Древней Греции. В котором повествуется о гигантском кровожадном человеке-быке – Минотавре."),
            //new Question(10, "Среди предложенных строений укажите лишнее:", new String[]{"1531","1345", "1242", "1234"}, 0, "Колизей является памятником архитектуры. "),
            new Question(11, "До строительства в 1889 г. Парижской Эйфелевой башни самым высоким сооружением на земле была пирамида", new String[]{"Хефрена","Микерина", "Хеопса", "Кукулькана"}, 2, "Пирамида Хеопса (Хуфу) — крупнейшая из египетских пирамид, единственное из «Семи чудес света», сохранившееся до наших дней."),
            new Question(12, "Как называлась рыночная площадь в древнегреческих полисах, являвшаяся местом общегражданских собраний?", new String[]{"Ратуша","Агора", "Андрон", "Пьяца"}, 1, "Афинская агора это древний центр города. На агоре в Афинах велась торговля, отсюда же управляли страной."),
            //new Question(13, "В память о каком событии, произошедшем 1 (13) марта 1881 года, был возведен Храм Спаса-на-Крови?", new String[]{"1531","1345", "1242", "1234"}, 0, "Колизей является памятн"),
            new Question(14, "Примитивизм – это…", new String[]{"Искусство художников-самоучек","Стиль живописи", "Народные худ. промыслы", "Примитивные изображения"}, 1, "Примитивизм - стиль живописи зародился в XIX веке. Включает в себя обдуманное упрощение картины, которое делает её формы примитивными, как творчество ребёнка или рисунки первобытных времен."),
            new Question(15, "М.П. Мусоргский, Н.А. Римский-Корсаков, А.П. Бородин, М. А. Балакирев. В состав какого творческого сообщества входили перечисленные деятели искусства:", new String[]{"Могучая кучка","Бубновый валет", "Товарищество передвижников", "Мир искусства"}, 0, "Творческое содружество русских композиторов, сложившееся в Санкт-Петербурге в конце 1850-х и начале 1860-х годов."),
            new Question(16, "Картина «Актриса Маргарита». Кто автор?", new String[]{"Майкова Любовь Михайловна","Медведева Екатерина Ивановна ", "Анри Руссо", "Нико Пиросмани"}, 3, "Нико Пиросмани впервые увидел ее на афише и влюбился. Потрет женщины, к ногам которой Нико Пиросмани бросил «миллион алых роз»"),
            new Question(17, "Благодаря «кому» появились такие достояния музыкальной культуры и важнейшие понятия - мелодия, гармония, ритм, хор, оркестр, рапсодия и симфония:", new String[]{"Славянам","Грекам", "Египтянам", "Римлянам"}, 1, "Музыка сопровождала греков на шествиях, во время Олимпийских игр, поэтических турниров, театральных представлений"),
            new Question(18, "Как называется художественное объединение русских художников, танцоров, композиторов, которое возглавлял Сергей Дягилев:", new String[]{"Русские сезоны","Буря и натиск", "Могучая кучка", "Передвижники"}, 0, ". Главным делом жизни С.П. Дягилева стали «Русские сезоны» 1909-1929 годов, где он собрал творческий коллектив из самых великих деятелей искусства начала XX века и внес огромный вклад в пропаганду за рубежом русского оперного и балетного искусства.")
            //new Question(19, "Что является лишним в ряду?", new String[]{"Майкова Любовь Михайловна ","1345", "1242", "1234"}, 0, "Колизей является памятником архитект"),
            //new Question(20, "Что является лишним в ряду?", new String[]{"1531","1345", "1242", "1234"}, 0, "Колизей является памятником архит"),
    ));
    public Question(int id, String questionText, String[] answer, int trueAnswer, String description) {
        this.id = id;
        this.questionText = questionText;
        this.answer = answer;
        this.trueAnswer = trueAnswer;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String[] getAnswer() {
        return answer;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }
    
    public String getDescription() {
        return description;
    }

    public static ArrayList<Question> getQuestions() {
        return questions;
    }
}

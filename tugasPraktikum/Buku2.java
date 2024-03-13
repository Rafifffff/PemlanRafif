package tugasPraktikum;

public class Buku2 {
    public String [][] teknologi;
    public String [][] filsafat;
    public String [][] sejarah;
    public String [][] agama;
    public String [][] psikologi;
    public String [][] politik;
    public String [][] fiksi;

    public Buku2(){
        teknologi = new String[][]{ 
        {"The Art of Computer Programming", "Donald E. Knuth", "1968", "1088","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, aliquam placerat"},
        {"The C Programming Language", "Brian W. Kernighan, Dennis M. Ritchie", "1978", "228", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec, risus eget aliquam placerat"},
        {"Code: The Hidden Language of Computer Hardware and Software", "Charles Petzold", "1999", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. urna. Donec vehicula, risus eget aliquam placerat"},
        {"Design Patterns: Elements of Reusable Object-Oriented Software", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1994", "395", "Lorem ipsum dolor, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"You Don't Know JS", "Kyle Simpson", "2014", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  placerat"}
        };
        filsafat = new String[][]{
        {"The Republic", "Plato", "380 BC", "712", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"Meditations", "Marcus Aurelius", "185", "128", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus  aliquam placerat"},
        {"The Critique of Pure Reason", "Immanuel Kant", "1781", "752", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. risus eget aliquam placerat"},
        {"Being and Nothingness", "Jean-Paul Sartre", "1943", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  placerat"},
        {"The Alchemist", "Paulo Coelho", "1988", "167", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"}
        };
        sejarah = new String[][]{
        {"A People's History of the United States", "Howard Zinn", "1980", "728", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, eget aliquam placerat"},
        {"The Guns of August", "Barbara Tuchman", "1962", "464", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget  placerat"},
        {"The Rise and Fall of the Third Reich", "William L. Shirer", "1960", "1024", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. risus eget aliquam placerat"},
        {"The Autobiography of Malcolm X", "Malcolm X, Alex Haley", "1965", "320", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas  pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Diary of a Young Girl", "Anne Frank", "1952", "126", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna.  vehicula, risus eget aliquam placerat"}
        };
        agama = new String[][]{
        {"The Bible", "Various Authors", "1611", "1544", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Qur'an ", "Al-Zaid", "610", "604", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus placerat"},
        {"The Bhagavad Gita", "Krishna", "500 BC", "184", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Book of Mormon", "Joseph Smith", "1830", "544", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  eget aliquam placerat"},
        {"The Tao Te Ching", "Lao Tzu", "3rd century BC", "81", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget placerat"}
        };
        psikologi = new String[][]{
        {"Thinking, Fast and Slow", "Daniel Kahneman", "2011", "416", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  aliquam placerat"},
        {"The Power of Now", "Eckhart Tolle", "1997", "256", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, aliquam placerat"},
        {"The Body Keeps the Score", "Bessel van der Kolk", "2014", "336", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"Emotional Intelligence", "Daniel Goleman", "1995", "384", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus placerat"},
        {"The Art of Loving", "Erich Fromm", "1956", "256", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. placerat"}
        };
        politik = new String[][]{
        {"The Federalist Papers", "Alexander Hamilton, James Madison, John Jay", "1787", "400", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Communist Manifesto", "Karl Marx, Friedrich Engels", "1848", "128", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas  pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Prince", "Niccolò Machiavelli", "1532", "160", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Art of War", "Sun Tzu", "500 BC", "144", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, placerat"},
        {"The Federalist", "Alexander Hamilton", "1787", "85", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, reget aliquam placerat"}
        };
        fiksi = new String[][]{
        {"To Kill a Mockingbird", "Harper Lee", "1960", "281", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  eget aliquam placerat"},
        {"1984", "George Orwell", "1949", "328", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula, risus eget aliquam placerat"},
        {"The Great Gatsby", "F. Scott Fitzgerald", "1925", "180", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  aliquam placerat"},
        {"The Catcher in the Rye", "J.D. Salinger", "1951", "277", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas sit amet pretium urna. Donec vehicula,  aliquam placerat"},
        {"The Lord of the Rings", "J.R.R. Tolkien", "1954", "1200", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas. Donec vehicula, risus eget aliquam placerat"}
        };
    }
}

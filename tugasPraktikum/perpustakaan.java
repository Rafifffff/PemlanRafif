package tugasPraktikum;

import java.util.ArrayList;

public class perpustakaan {
    public static void main(String[] args) {
        String[] jenisBuku = {"Teknologi", "Teknologi", "Teknologi", "Teknologi", "Teknologi",
                          "Filsafat", "Filsafat", "Filsafat", "Filsafat", "Filsafat",
                          "Sejarah", "Sejarah", "Sejarah", "Sejarah", "Sejarah",
                          "Agama", "Agama", "Agama", "Agama", "Agama",
                          "Psikologi", "Psikologi", "Psikologi", "Psikologi", "Psikologi",
                          "Politik", "Politik", "Politik", "Politik", "Politik",
                          "Fiksi", "Fiksi", "Fiksi", "Fiksi", "Fiksi"};

        String[][] dataBuku = {
            {"The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson", "2014"},
            {"Elon Musk: Tesla, SpaceX, and the Quest for a Fantastic Future", "Ashlee Vance", "2015"},
            {"Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2014"},
            {"The Singularity Is Near: When Humans Transcend Biology", "Ray Kurzweil", "2005"},
            {"The Code Book: The Science of Secrecy from Ancient Egypt to Quantum Cryptography", "Simon Singh", "1999"},

            {"Sophie's World", "Jostein Gaarder", "1991"},
            {"Meditations", "Marcus Aurelius", "180 M"},
            {"The Republic", "Plato", "-"},
            {"Thus Spoke Zarathustra", "Friedrich Nietzsche", "1883"},
            {"Critique of Pure Reason", "Immanuel Kant", "1781"},

            {"Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", "1997"},
            {"A People's History of the United States", "Howard Zinn", "1980"},
            {"The Silk Roads: A New History of the World", "Peter Frankopan", "2015"},
            {"1491: New Revelations of the Americas Before Columbus", "Charles C. Mann", "2005"},
            {"The Rise and Fall of the Third Reich", "William L. Shirer", "1960"},

            {"The Holy Bible", "Various Authors", "-"},
            {"The Qur'an", "Various Authors", "-"},
            {"Bhagavad Gita", "Various Authors", "-"},
            {"Tao Te Ching", "Laozi", "-"},
            {"The Tibetan Book of Living and Dying", "Sogyal Rinpoche", "1992"},

            {"Man's Search for Meaning", "Viktor E. Frankl", "1946"},
            {"Thinking, Fast and Slow", "Daniel Kahneman", "2011"},
            {"The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "2012"},
            {"The Man Who Mistook His Wife for a Hat and Other Clinical Tales", "Oliver Sacks", "1985"},
            {"Quiet: The Power of Introverts in a World That Can't Stop Talking", "Susan Cain", "2012"},

            {"The Prince", "Niccolò Machiavelli", "1532"},
            {"The Communist Manifesto", "Karl Marx and Friedrich Engels", "1848"},
            {"The Federalist Papers", "Alexander Hamilton, James Madison, and John Jay", "1788"},
            {"The Audacity of Hope: Thoughts on Reclaiming the American Dream", "Barack Obama", "2006"},
            {"Democracy in America", "Alexis de Tocqueville", "1835"},

            {"1984", "George Orwell", "1949"},
            {"To Kill a Mockingbird", "Harper Lee", "1960"},
            {"The Great Gatsby", "F. Scott Fitzgerald", "1925"},
            {"The Catcher in the Rye", "J.D. Salinger", "1951"},
            {"One Hundred Years of Solitude", "Gabriel García Márquez", "1967"}
        };

        ArrayList<Buku> koleksiBuku = new ArrayList<>();

        for (int i = 0; i < dataBuku.length; i++) {
            Buku bukuBaru = new Buku();
            bukuBaru.setKategoriBuku(jenisBuku[i]);
            bukuBaru.setJudulBuku(dataBuku [i][0]);
            bukuBaru.setPenulisBuku(dataBuku[i][1]);
            bukuBaru.setTahunTerbit(dataBuku[i][2]);
            koleksiBuku.add(bukuBaru);
        }

        String[] kategori = {"Teknologi", "Filsafat", "Sejarah", "Agama", "Psikologi", "Politik", "Fiksi"};

        for (String kat : kategori) {
            System.out.println("========================");
            System.out.println(kat);
            System.out.println("========================");
            for (Buku buku : koleksiBuku) {
                if (buku.getKategoriBuku().equals(kat)) {
                    buku.displayInfo();
                }
            }
        }
    }
}





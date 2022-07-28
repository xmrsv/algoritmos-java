public boolean find(int elementsAmount, int elementIndex, String filename, String element, String separator) {
    int found = 0;
    String line;
    String[] elements = new String[elementsAmount];
    try {
        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while ((line = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(line, separator);
            for (int i = 0; (stringTokenizer.hasMoreTokens()); i++)  elements[i] = stringTokenizer.nextToken()
            if (elements[elementIndex].equals(element)) found++;
                
        }
    } catch (IOException e) {
        System.out.println(e);
    }
    return found > 0;
}

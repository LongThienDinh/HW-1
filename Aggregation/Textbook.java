class Textbook 
{
    private String titleOfTextbook;
    private String authorOfTextbook;
    private String publisherOfTextbook;

    public Textbook(String titleOfTextbook, String authorOfTextbook, String publisherOfTextbook) {
        this.titleOfTextbook = titleOfTextbook;
        this.authorOfTextbook = authorOfTextbook;
        this.publisherOfTextbook = publisherOfTextbook;
    }

    public void setTitleOfTextbook(String titleOfTextbook) 
    { 
        this.titleOfTextbook = titleOfTextbook; 
    }

    public void setAuthorOfTextbook(String authorOfTextbook) 
    { 
        this.authorOfTextbook = authorOfTextbook; 
    }

    public void setPublisherOfTextbook(String publisheOfTextbook) 
    { 
        this.publisherOfTextbook = publisherOfTextbook; 
    }


    public String getTitleOfTextbook() 
    { 
        return titleOfTextbook; 
    }

    public String getAuthorOfTextbook() 
    { 
        return authorOfTextbook; 
    }

    public String getPublisherOfTextbook() 
    { 
        return publisherOfTextbook; 
    }
}


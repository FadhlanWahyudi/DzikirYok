package com.fadhlan.dzikirapp;

public class ModelDzikir {
        private String judul;
        private String subJudul;

        public ModelDzikir(String judul, String subJudul) {
            this.judul = judul;
            this.subJudul = subJudul;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getSubJudul() {
            return subJudul;
        }

        public void setSubJudul(String subJudul) {
            this.subJudul = subJudul;
        }
    }




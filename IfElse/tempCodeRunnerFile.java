if(n<0){
            return 1.0/(x*call*call);
        }
        if(n%2==0) return call*call;
        else return x*call*call;
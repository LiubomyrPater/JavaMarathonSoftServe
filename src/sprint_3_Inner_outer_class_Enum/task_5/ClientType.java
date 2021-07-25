package sprint_3_Inner_outer_class_Enum.task_5;

public enum ClientType{
    NEW(1){
        @Override
        public double discount() {
            return super.discount();
        }
    },
    SILVER(12){
        @Override
        public double discount() {
            return (100 - this.getMonth() * 0.25) / 100;
        }
    },
    GOLD(30){
        @Override
        public double discount(){
            return (100 - this.getMonth() * 0.3) / 100;
        }
    },
    PLATINUM(60){
        @Override
        public double discount(){
            return (100 - this.getMonth() * 0.35) / 100;
        }
    };

    private int months;

    ClientType(int months) {
        this.months = months;
    }

    public int getMonth(){
        return months;
    }

    public double discount(){
        return 1;
    }
}

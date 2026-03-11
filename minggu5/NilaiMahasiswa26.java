package minggu5;

public class NilaiMahasiswa26 {
    
    int uts[];
    int uas[];

    NilaiMahasiswa26(int jumlah) {
        uts = new int[jumlah];
        uas = new int[jumlah];
    }

    // Divide and Conquer mencari UTS tertinggi
    int maxUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMax = maxUTS(arr, l, mid);
        int rightMax = maxUTS(arr, mid + 1, r);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    // Divide and Conquer mencari UTS terendah
    int minUTS(int arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        int leftMin = minUTS(arr, l, mid);
        int rightMin = minUTS(arr, mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    // Brute Force menghitung rata-rata UAS
    double rataUAS() {
        double total = 0;

        for (int i = 0; i < uas.length; i++) {
            total += uas[i];
        }

        return total / uas.length;
    }
}
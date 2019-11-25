package rentalmbs;


import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import rentalmbs.Database;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 04
 */
public class Dashboard {
    
    //attribute for summary
    private JTable DashboardTB;
    private JTable CheckTB;
    private JTable TransTB;
    //Status Panel
    private JLabel Available, Busy,Check;
    private Date Clock;  
    private JList notification;
    
    //attrbute for sale_panel
    private double wholeSale, cost;
    private JLabel whole_sale , amount_transaction, expense,revenue;
    private JLabel status_label;
    private JPanel status_panel;
    
    private JComboBox<String> select_month,select_year;
    private JPanel pnChart;
    int[] l_month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    
    

    public Dashboard(JTable DashboardTB, JTable CheckTB, JTable TransTB, JLabel Available, JLabel Busy, JLabel Check, Date Clock, JList notification, JLabel whole_sale, JLabel amount_transaction, JLabel expense, JLabel revenue) {
        this.DashboardTB = DashboardTB;
        this.CheckTB = CheckTB;
        this.TransTB = TransTB;
        this.Available = Available;
        this.Busy = Busy;
        this.Check = Check;
        this.Clock = Clock;
        this.notification = notification;
        this.whole_sale = whole_sale;
        this.amount_transaction = amount_transaction;
        this.expense = expense;
        this.revenue = revenue;
    }
    
    
    
     public JLabel getWhole_sale() {
        return whole_sale;
    }
    
    public double getWholeSale() {
        return wholeSale;
    }

    public JPanel getStatus_panel() {
        return status_panel;
    }

    public void setWholeSale(double wholeSale) {
        this.wholeSale = wholeSale;
    }

    public void setWhole_sale(JLabel whole_sale) {
        this.whole_sale = whole_sale;
    }

    public void setStatus_panel(JPanel status_panel) {
        this.status_panel = status_panel;
    }

    public JLabel getRevenue() {
        return revenue;
    }

    public void setRevenue(JLabel revenue) {
        this.revenue = revenue;
    }

    public JLabel getStatus_label() {
        return status_label;
    }

    public void setStatus_label(JLabel status_label) {
        this.status_label = status_label;
    }

    public JComboBox<String> getSelect_month() {
        return select_month;
    }

    public void setSelect_month(JComboBox<String> select_month) {
        this.select_month = select_month;
    }

    public JComboBox<String> getSelect_year() {
        return select_year;
    }

    public void setSelect_year(JComboBox<String> select_year) {
        this.select_year = select_year;
    }

    public JPanel getPnChart() {
        return pnChart;
    }

    public void setPnChart(JPanel pnChart) {
        this.pnChart = pnChart;
    }

    public JTable getDashboardTB() {
        return DashboardTB;
    }

    public void setDashboardTB(JTable DashboardTB) {
        this.DashboardTB = DashboardTB;
    }

    public JTable getTransTB() {
        return TransTB;
    }

    public void setTransTB(JTable TransTB) {
        this.TransTB = TransTB;
    }

    public JList getNotification() {
        return notification;
    }

    public void setNotification(JList notification) {
        this.notification = notification;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public JLabel getAmount_transaction() {
        return amount_transaction;
    }

    public void setAmount_transaction(JLabel amount_transaction) {
        this.amount_transaction = amount_transaction;
    }

    public JLabel getExpense() {
        return expense;
    }

    public void setExpense(JLabel expense) {
        this.expense = expense;
    }

    public JTable getCheckTB() {
        return CheckTB;
    }

    public void setCheckTB(JTable CheckTB) {
        this.CheckTB = CheckTB;
    }

    public JLabel getAvailable() {
        return Available;
    }

    public void setAvailable(JLabel Available) {
        this.Available = Available;
    }

    public JLabel getBusy() {
        return Busy;
    }

    public void setBusy(JLabel Busy) {
        this.Busy = Busy;
    }

    public JLabel getCheck() {
        return Check;
    }

    public void setCheck(JLabel Check) {
        this.Check = Check;
    }
    
    
    //4392
    public void updateStatus(){
        
        int r = DashboardTB.getRowCount(), avai = 0, no_avai = 0;

        int row_checkTB = CheckTB.getRowCount();

            for (int i = 0; i < r; i++) {
                Object obj1 = GetData(DashboardTB, i, 5);
                if (obj1.equals("ว่าง")) {
                    avai++;
                } else if (obj1.equals("ไม่ว่าง")) {
                    no_avai++;
                }

            }

            Available.setText(avai + "");
            Busy.setText(no_avai + "");
            Check.setText(row_checkTB + "");
    }
    
    /**
     *
     * @throws ParseException
     */
    public void notification() throws ParseException {
        DefaultListModel mod = new DefaultListModel();
        notification.setModel(mod);

        Object[][] data = notification_dataset();

        int row = DashboardTB.getRowCount();

        for (int i = 0; i < row; i++) {
            if (data[i][4].toString().equals("-")) {

            } else {
                String return_day = data[i][4].toString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM", Locale.ENGLISH);
                String timeString = formatter.format(new java.util.Date());

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM", Locale.ENGLISH);
                java.util.Date firstDate = sdf.parse(return_day);
                java.util.Date secondDate = sdf.parse(timeString);

                long day_diff = (secondDate.getTime() - firstDate.getTime()) / (1000 * 60 * 60 * 24);
                //long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

                //ติดลบ เกินไปเเล้วกี่วัน
                if (day_diff < 0) {
                    System.out.println("เลยไปเเล้ว " + Math.abs(day_diff));
                    mod.addElement(return_day + " : รถหมายเลข " + data[i][1].toString().substring(8) + " จะคืนอีกภายใน " + Math.abs(day_diff) + " วัน");
                } else if (day_diff < 30) {
                    //ถึงวันคืนอีกในวันที่
                    System.out.println("จะคืนอีกภายใน " + Math.abs(day_diff));
                    mod.addElement(return_day + " : รถหมายเลข " + data[i][1].toString().substring(8) + " เลยเวลาคืนไปเเล้ว " + Math.abs(day_diff) + " วัน");

                }

            }
        }

    }
    
     public Object[][] notification_dataset() {
        int row = DashboardTB.getRowCount();
        System.out.println("Query from jTable1");

        //[date][cost][revenue/expense][detail]
        Object[][] data = new Object[row][5];

        for (int i = 0; i < row; i++) {
            data[i][0] = GetData(TransTB, i, 0).toString();
            data[i][1] = GetData(TransTB, i, 1).toString();
            data[i][2] = GetData(TransTB, i, 2).toString();
            data[i][3] = GetData(TransTB, i, 3).toString();
            data[i][4] = GetData(TransTB, i, 4).toString();
        }

        return data;
    }

    
     public Object GetData(JTable table, int row_index, int col_index) {
        return table.getModel().getValueAt(row_index, col_index);
    }
   

    
    private void lineCreate() {
        // create line chart
        int month = Integer.parseInt(select_month.getSelectedItem().toString().substring(0, 2));
        String year = select_year.getSelectedItem().toString();

        JFreeChart lineChart = ChartFactory.createLineChart3D(
                "Revenue-Expense Chart of " + select_month.getSelectedItem().toString().substring(2),
                "date", "Amount(บาท)",
                createDataset(jtable2_getdata(), TransTB.getRowCount(), month, year),
                PlotOrientation.VERTICAL,
                true, true, false);
        // set color
        CategoryPlot plot = lineChart.getCategoryPlot();

        LineAndShapeRenderer renderer = new LineAndShapeRenderer();

    // sets paint color for each series
        plot.getRenderer().setSeriesPaint(0, Color.GREEN);
        plot.getRenderer().setSeriesPaint(1, Color.RED);

        plot.setBackgroundPaint(Color.YELLOW);

        plot.setOutlinePaint(Color.black);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

    // sets thickness for series (using strokes)
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        renderer.setSeriesStroke(1, new BasicStroke(2.0f));

        //plot.setRenderer(renderer);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(lineChart);
        pnChart.removeAll();    // clear panel before add new chart
        pnChart.add(chartPanel, BorderLayout.CENTER);
        pnChart.validate();       // refresh panel to display new chart
        
        update();
    }

    private void PieChart() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        Object[][] data = jtable2_getdata("");
        int row = TransTB.getRowCount();
        double[] expense = new double[]{0, 0, 0, 0, 0};

        int select_m = Integer.parseInt(select_month.getSelectedItem().toString().substring(0, 2));
        int select_y = Integer.parseInt(select_year.getSelectedItem().toString());
        for (int i = 0; i < row; i++) {

            int month = Integer.parseInt(data[i][0].toString().substring(3, 5));
            String year_c = data[i][0].toString().substring(6);

            System.out.println(select_m + " " + select_y + " " + month + " " + year_c + " ");

            if (select_m == month && (year_c.equals(select_y + "") || year_c.equals((select_y + 543) + ""))) {
                switch (data[i][3].toString()) {
                    case "ค่าซ่อมบำรุง":
                        expense[0] += Double.parseDouble(data[i][1].toString());
                        break;
                    case "ค่าคอมมิสชั่น":
                        expense[1] += Double.parseDouble(data[i][1].toString());
                        break;
                    case "เงินเดือนพนักงาน":
                        expense[2] += Double.parseDouble(data[i][1].toString());
                        break;
                    case "ชำระหนี้":
                        expense[3] += Double.parseDouble(data[i][1].toString());
                        break;
                    case "อื่นๆ":
                        expense[4] += Double.parseDouble(data[i][1].toString());
                        break;

                    default:;
                }

            }

        }

        dataset.setValue("ค่าซ่อมบำรุง", new Double(expense[0]));
        dataset.setValue("ค่าคอมมิสชั่น", new Double(expense[1]));
        dataset.setValue("เงินเดือนพนักงาน", new Double(expense[2]));
        dataset.setValue("ชำระหนี้", new Double(expense[3]));
        dataset.setValue("อื่นๆ", new Double(expense[4]));
        // create pir chart
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Expense Structure of Month", // chart title
                dataset, // data
                true, // include legend
                true,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        plot.setBackgroundPaint(Color.PINK);

        plot.setOutlinePaint(Color.black);
        plot.setOutlineStroke(new BasicStroke(2.0f));

        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        pnChart.removeAll();        // clear panel before add new chart
        pnChart.add(chartPanel, BorderLayout.CENTER);
        pnChart.validate();         // refresh panel to display new chart
        
    }
    
     
      public void update() {
        String month = select_month.getSelectedItem().toString().substring(0, 2);
        int year = Integer.parseInt(select_year.getSelectedItem().toString());

        String[] query = new String[]{month + "-" + year, month + "-" + (year + 543)};
        wholeSale = 0;
        cost = 0;
        setWhole_sale(query);
        revenue.setText(wholeSale + "");
        expense.setText(cost + "");
        whole_sale.setText(wholeSale - cost + "");

        if (wholeSale - cost < 0) {
            status_label.setText("ขาดทุน");
            whole_sale.setBackground(Color.red);
            status_label.setForeground(Color.white);
            status_panel.setBackground(Color.red);
        } else {
            status_label.setText("กำไร");
            whole_sale.setBackground(Color.green);
            status_label.setForeground(Color.black);
            status_panel.setBackground(Color.green);
        }
        
        amount_transaction.setText(TransTB.getRowCount() + "");

    }


    public void setWhole_sale(String[] query) {

        Object[][] data = this.jtable2_getdata();
        for (int i = 0; i < TransTB.getRowCount(); i++) {
            if (data[i][0].toString().substring(3).equals(query[0]) || data[i][0].toString().substring(3).equals(query[1])) {
                if (data[i][2].equals("รายรับ")) {
                    this.wholeSale += Double.parseDouble(data[i][1].toString());
                }
                if (data[i][2].equals("รายจ่าย")) {
                    this.cost += Double.parseDouble(data[i][1].toString());
                }

            }

        }

    }

    public Object[][] jtable2_getdata() {

        String format_query = select_month.getSelectedItem().toString().substring(0, 2) + "-" + select_year.getSelectedItem().toString();
        int row = TransTB.getRowCount();
        System.out.println("Quering from jTable2 with " + format_query);

        //[date][cost][revenue/expense][detail]
        Object[][] data = new Object[row][4];

        for (int i = 0; i < row; i++) {
            Object date = GetData(TransTB, i, 0);
            data[i][0] = date.toString();
            double mon = Double.parseDouble(GetData(TransTB, i, 3).toString());
            data[i][1] = mon;
            data[i][2] = GetData(TransTB, i, 2).toString();
            data[i][3] = GetData(TransTB, i, 1).toString();
        }

        return data;
    }

    public Object[][] jtable2_getdata(String n) {

        String format_query = select_month.getSelectedItem().toString().substring(0, 2) + "-" + select_year.getSelectedItem().toString();
        int row = TransTB.getRowCount();
        System.out.println("Query from jTable2 with " + format_query);

        //[date][cost][revenue/expense][detail]
        Object[][] data = new Object[row][4];

        for (int i = 0; i < row; i++) {
            Object date = GetData(TransTB, i, 0);
            data[i][0] = date.toString();
            double mon = Double.parseDouble(GetData(TransTB, i, 3).toString());
            data[i][1] = mon;
            data[i][2] = GetData(TransTB, i, 2).toString();
            data[i][3] = GetData(TransTB, i, 1).toString();

        }

        return data;
    }
   

    private DefaultCategoryDataset createDataset(Object[][] data, int len, int m, String y) {

        String series1 = "รายรับ";
        String series2 = "รายจ่าย";

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        //iวัน
        //spent[i][0] = รายรับ;
        //spent[i][1] = รายจ่าย;
        Object[][] spent = new Object[32][2];

        for (int i = 1; i < (l_month[m - 1]) + 1; i++) {
            double temp_rev = 0, temp_expense = 0;
            for (int j = 0; j < len; j++) {
                int day = Integer.parseInt(data[j][0].toString().substring(0, 2));
                int month = Integer.parseInt(data[j][0].toString().substring(3, 5));
                String year_c = data[j][0].toString().substring(6);

                int year_bd = Integer.parseInt(year_c);

                System.out.println(day + " " + month + " " + year_c + " " + year_bd);
                if ((day == i) && (month == m) && (year_c.equals(y) || (year_bd == Integer.parseInt(y) + 543))) {
                    if (data[j][2].toString().equals("รายรับ")) {
                        temp_rev += Double.parseDouble(data[j][1].toString());
                        System.out.println(data[j][0].toString() + " " + data[j][0].toString().substring(0, 2) + " " + temp_rev);
                    } else {
                        temp_expense += Double.parseDouble(data[j][1].toString());
                        System.out.println(data[j][0].toString() + " " + data[j][0].toString().substring(0, 2) + " " + temp_expense);
                    }
                }

            }
            spent[i][0] = temp_rev;
            spent[i][1] = temp_expense;
        }

        for (int i = 1; i < (l_month[m - 1]) + 1; i++) {
            dataset.addValue(Double.parseDouble(spent[i][0].toString()), series1, i + "");

            dataset.addValue(Double.parseDouble(spent[i][1].toString()), series2, i + "");
        }

        return dataset;
    }
    

    
    
    
    
    
}

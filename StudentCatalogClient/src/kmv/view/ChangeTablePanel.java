package kmv.view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.FlowLayout;

public class ChangeTablePanel extends JPanel implements ViewConstants{
    private StudentTableView tableView;
    private JComboBox<Integer> numberPage;
    private JLabel currentPageIndexText;
    private JLabel currentPageIndex;
    private JLabel allPageText;
    private JLabel allPage;
    private JLabel allRecordText;
    private JLabel allRecord;

    public ChangeTablePanel(StudentTableView tableView){
        this.tableView = tableView;
        this.setLayout(new FlowLayout());

        JToolBar jtbPage = new JToolBar("Work with page", JToolBar.HORIZONTAL);
        ImageIcon imFirst = new ImageIcon(FIRST_TOOLBAR_PAGE);
        ImageIcon imPrevious = new ImageIcon(PREVIOUS_TOOLBAR_PAGE);
        ImageIcon imNext = new ImageIcon(NEXT_TOOLBAR_PAGE);
        ImageIcon imLast = new ImageIcon(LAST_TOOLBAR_PAGE);

        JButton jbFirst = new JButton(imFirst);
        JButton jbPrevious = new JButton(imPrevious);
        JButton jbNext = new JButton(imNext);
        JButton jbLast = new JButton(imLast);

        jtbPage.add(jbFirst);
        jtbPage.add(jbPrevious);
        jtbPage.add(jbNext);
        jtbPage.add(jbLast);
        jtbPage.setFloatable(false);
        add(jtbPage);

        numberPage = new JComboBox<Integer>(NUMBER_PAGE);
        add(numberPage);

        currentPageIndexText = new JLabel("Current page: ");
        currentPageIndex = new JLabel(String.valueOf(0));
        allPageText = new JLabel("/");
        allPage = new JLabel(String.valueOf(tableView.getNumberPage()));
        allRecordText = new JLabel("All records: ");
        allRecord = new JLabel(String.valueOf(tableView.getCountRecord()));

        add(currentPageIndexText);
        add(currentPageIndex);
        add(allPageText);
        add(allPage);
        add(allRecordText);
        add(allRecord);

        numberPage.addActionListener(new ChangeNumberPageListener(this));
        jbNext.addActionListener(new GoToNextPageListener(this));
        jbFirst.addActionListener(new GoToFirstPageListener(this));
        jbPrevious.addActionListener(new GoToPreviousPageListener(this));
        jbLast.addActionListener(new GoToLastPageListener(this));
    }

    public StudentTableView getTableView() {
        return tableView;
    }

    public JComboBox<Integer> getNumberPage(){
        return numberPage;
    }

    public JLabel getCurrentPageIndex(){
        return currentPageIndex;
    }

    public JLabel getAllPage(){
        return allPage;
    }

    public JLabel getAllRecord(){
        return allRecord;
    }

}

import javax.swing.*;
import java.awt.*;

public class SwingGui extends JFrame {

    public SwingGui() {
        // [기본 설정] 윈도우 타이틀 및 크기 세팅
        setTitle("SWING 배치관리자 프로그래밍 및 대조 실험 연구");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(880, 520); // 텍스트가 잘리지 않도록 가로 폭을 850 -> 880으로 여유 있게 확장
        setLocationRelativeTo(null); // 화면 중앙 배치

        // [전체 틀] 왼쪽(A구역)과 오른쪽(B구역)을 1행 2열로 균등하게 분할 (GridLayout 활용)
        setLayout(new GridLayout(1, 2, 15, 0));

        // 공통 폰트 설정 (특수문자 및 영문 잘림을 방지하기 위해 가장 안정적인 Dialog 볼드 폰트 적용)
        Font mainFont = new Font("Apple SD Gothic Neo", Font.PLAIN, 12);
        Font titleFont = new Font("Apple SD Gothic Neo", Font.BOLD, 14);

        // Apple 스타일 공통 색상 정의
        Color appleLightGray = new Color(245, 245, 247);
        Color appleBorderColor = new Color(215, 215, 215);

        /* ==========================================================
         * [대조군 A - 왼쪽] 다양한 배치관리자(Border, Flow, Grid)의 유기적 중첩
         * ========================================================== */
        JPanel leftPanel = new JPanel(new BorderLayout(5, 10));
        leftPanel.setBackground(appleLightGray);

        leftPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(appleBorderColor, 1, true),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        // 상단 서브 패널 (제목 + 상태창)
        JPanel leftHeaderPanel = new JPanel(new BorderLayout(0, 8));
        leftHeaderPanel.setOpaque(false);

        // [글자 잘림 해결] 완벽한 문자열 출력을 위해 레이블 생성
        JLabel leftTitleLabel = new JLabel("A구역: Layout Manager 복합 적용");
        leftTitleLabel.setFont(titleFont);
        leftTitleLabel.setForeground(new Color(51, 51, 51));
        leftHeaderPanel.add(leftTitleLabel, BorderLayout.NORTH);

        // A-1. 상단 컨트롤 구역
        JPanel leftNorthPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        leftNorthPanel.setOpaque(false);
        JLabel stateLabel = new JLabel("상태: 실험 가동 중");
        stateLabel.setFont(mainFont);
        stateLabel.setForeground(new Color(52, 199, 89));
        JButton infoButton = new JButton("ℹ 도움말");
        infoButton.setFont(mainFont);
        leftNorthPanel.add(stateLabel);
        leftNorthPanel.add(infoButton);

        leftHeaderPanel.add(leftNorthPanel, BorderLayout.CENTER);
        leftPanel.add(leftHeaderPanel, BorderLayout.NORTH);

        // A-2. 중앙 구역
        JTextArea leftArea = new JTextArea("★ Layout Manager 구역 ★\n창 모서리를 잡고 늘려보세요.\n이 입력 필드와 하단 버튼들이 비율에 맞춰 유연하게 확장됩니다.\n");
        leftArea.setFont(mainFont);
        leftArea.setLineWrap(true);
        leftArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JScrollPane leftScroll = new JScrollPane(leftArea);
        leftScroll.setBorder(BorderFactory.createLineBorder(appleBorderColor));
        leftPanel.add(leftScroll, BorderLayout.CENTER);

        // A-3. 하단 구역
        JPanel leftSouthPanel = new JPanel(new GridLayout(1, 2, 8, 0));
        leftSouthPanel.setOpaque(false);
        JButton leftBtn1 = new JButton("출력");
        leftBtn1.setBackground(Color.WHITE);
        leftBtn1.setFocusPainted(false);
        JButton leftBtn2 = new JButton("초기화");
        leftBtn2.setBackground(Color.WHITE);
        leftBtn2.setFocusPainted(false);
        leftSouthPanel.add(leftBtn1);
        leftSouthPanel.add(leftBtn2);
        leftPanel.add(leftSouthPanel, BorderLayout.SOUTH);


        /* ==========================================================
         * [대조군 B - 오른쪽] 배치관리자 무효화(null) 및 절대 좌표 고정
         * ========================================================== */
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(new Color(253, 244, 245));

        rightPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(appleBorderColor, 1, true),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        // [글자 잘림 및 띄어쓰기 해결]
        // 1. 소괄호와 영문이 짤리지 않도록 가로 폭(Width)을 350 -> 390으로 크게 늘렸습니다.
        // 2. 폰트 렌더링 버그를 우회하기 위해 안정적인 기본 폰트를 지정했습니다.
        JLabel rightTitleLabel = new JLabel("B구역: setLayout(null) 절대 좌표 고정");
        rightTitleLabel.setFont(titleFont);
        rightTitleLabel.setForeground(new Color(255, 59, 48));
        rightTitleLabel.setBounds(20, 15, 390, 22); // 가로 폭을 늘려 텍스트가 들어설 공간을 확보
        rightPanel.add(rightTitleLabel);

        // B-1. 상단 라벨 절대 배정
        JLabel rightLabel = new JLabel("경고: 창을 늘려도 컴포넌트가 꼼짝하지 않습니다.");
        rightLabel.setFont(mainFont);
        rightLabel.setForeground(new Color(255, 59, 48));
        rightLabel.setBounds(20, 45, 350, 20);
        rightPanel.add(rightLabel);

        // B-2. 중앙 텍스트 필드 절대 배정
        JTextArea rightArea = new JTextArea("★ Absolute Null 구역 ★\n창을 아무리 늘려도 이 텍스트 영역은 처음 지정된 픽셀 크기 그대로 고정되어 심각한 여백이 발생합니다.\n");
        rightArea.setFont(mainFont);
        rightArea.setLineWrap(true);
        rightArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        JScrollPane rightScroll = new JScrollPane(rightArea);
        rightScroll.setBorder(BorderFactory.createLineBorder(appleBorderColor));
        rightScroll.setBounds(20, 75, 360, 310);
        rightPanel.add(rightScroll);

        // B-3. 하단 버튼 절대 배정
        JButton rightBtn = new JButton("출력");
        rightBtn.setBackground(Color.WHITE);
        rightBtn.setFocusPainted(false);
        rightBtn.setBounds(20, 395, 360, 30);
        rightPanel.add(rightBtn);


        // [메인 프레임 결합] 1:1 Grid 구조의 프레임에 좌/우 패널 최종 탑재
        add(leftPanel);
        add(add(rightPanel) != null ? rightPanel : rightPanel);

        /* ==========================================================
         * [사용자 이벤트 처리] 인터랙티브 동작 기능 핸들링
         * ========================================================== */
        leftBtn1.addActionListener(e -> {
            leftArea.append("\n[이벤트] 왼쪽 첫 번째 버튼이 클릭되었습니다.");
            stateLabel.setText("상태: 출력(왼편) 작동 완료");
        });

        leftBtn2.addActionListener(e -> {
            leftArea.setText("[이벤트] 텍스트 창이 초기화되었습니다.\n");
            stateLabel.setText("상태: 실험 가동 중");
        });

        infoButton.addActionListener(e ->
                JOptionPane.showMessageDialog(this, "Layout Manager는 반응형 UI의 핵심입니다.", "안내", JOptionPane.INFORMATION_MESSAGE)
        );

        rightBtn.addActionListener(e ->
                rightArea.append("\n[이벤트] 오른쪽 고정 버튼이 클릭되었습니다.")
        );
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new SwingGui().setVisible(true);
        });
    }
}
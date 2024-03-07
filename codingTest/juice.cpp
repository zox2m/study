#include <string>
#include <vector>
#include <iostream>

using namespace std;

void dfs(int x, int y,vector<vector<int>> icePan, vector<vector<bool>> visited,int dx[],int dy[], int &answer){
    if (x<0 || x>visited.size() || y<0 || y>visited[0].size()) return; // 범위 밖은 스킵 
    if (visited[x][y]) return; // 이미 방문한 곳은 스킵 

    visited[x][y] = true; // 방문 표시

    if(icePan[x][y]==0){
        for(int i = 0;i<4;i++){ // 상하좌우 탐색
        int nx = x + dx[i];
        int ny = y + dy[i];

        dfs(nx,ny,icePan,visited,dx,dy,answer);
        answer ++;
    }

    
    }
}
int solution() {
    int n = 0; // 세로
    int m = 0; // 가로
    vector<vector<int>> icePan; // 얼음판
    vector<vector<bool>> visited; // 방문여부 
    
    int answer = 0; // 얼음 개수 

    int dx[] = {0, 0, -1, 1}; // 다들 요런식으로 쓰더라!!
    int dy[] = {-1, 1, 0, 0}; // 이 방식 외워두자.. 
    
    cin >> n >> m; // n m 이 입력됨

    //visited 벡터 초기화
    visited.resize(n, vector<bool>(m, false));

    // 2차원 리스트의 맵 정보 입력 받기
    icePan.resize(n, vector<int>(m, 0));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            char c;
            cin >> c;
            icePan[i][j] = c - '0';
        }
    }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            dfs(0,0,icePan,visited,dx,dy,answer);
        }
    }
    
    return answer;
}


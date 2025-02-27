# 프로젝트 제목

이 프로젝트는 Spring과 React를 사용하여 기본적인 회원가입, 로그인, 탈퇴, 로그아웃 기능을 구현한 애플리케이션입니다. JWT(JSON Web Token)를 이용한 인증 방식을 사용하며, Access Token과 Refresh Token을 통해 보안을 강화하였습니다.

## 기능

- **회원가입**: 사용자가 회원가입을 통해 계정을 생성할 수 있습니다.
- **로그인**: 입력한 자격 증명으로 사용자가 로그인할 수 있습니다.
- **탈퇴**: 사용자가 계정을 탈퇴할 수 있는 기능을 제공합니다.
- **로그아웃**: 사용자가 로그아웃하여 세션을 종료할 수 있습니다.
- **JWT 인증**: Access Token과 Refresh Token을 사용하여 안전한 인증을 제공합니다.

## 기술 스택

- **백엔드**: Spring Boot
- **프론트엔드**: React
- **데이터베이스**: Mysql
- **웹 서버**: Nginx
- **도구**: Docker, Docker Compose

## 환경 변수 관리

이 프로젝트에서는 Docker Compose를 사용하여 환경 변수를 관리합니다. 환경 변수는 `.env` 파일에 정의되어 있으며, 이 파일은 GitHub에 포함되지 않습니다. 따라서 사용자는 GitHub에서 클론한 후, `.env` 파일을 직접 작성해야 합니다.

### `.env` 파일 예시

```env
# .env 파일 예시
JWT_SECRET_KEY=your_jwt_token
MYSQL_ROOT_PASSWORD=your_db_password
MYSQL_DATABASE=your_db
MYSQL_USER=user_name
MYSQL_PASSWORD=user_password
SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/{데이터베이스 이름}?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&allowPublicKeyRetrieval=true
MAIL_ADDRESS=your_email
APP_PASSWORD=email_password
```

## 설치 방법 및 실행

다음 단계에 따라 프로젝트를 설치하고 실행하세요:

### 1.저장소 클론

```1.
git clone https://github.com/Habeomsu/auth-template.git
```

### 2.클론한 디렉토리로 이동

```2.
cd auth-template
```

### 3. 프론트앤드 디렉토리로 이동 및 의존성 설치

```3.
cd auth_front
npm install
```

### 4. 백엔드 디렉토리로 이동 및 의존성 설치

```4.
cd ../auth_back
./mvnw install
```

### 5. 환경변수 파일 생성(.env)

```5.
cd ..
touch .env
nano .env
```

### 6. 환경변수 파일 작성(.env)

```6.
JWT_SECRET_KEY=your_jwt_token
MYSQL_ROOT_PASSWORD=your_db_password
MYSQL_DATABASE=your_db
MYSQL_USER=user_name
MYSQL_PASSWORD=user_password
SPRING_DATASOURCE_URL=your_datasource
MAIL_ADDRESS=your_email
APP_PASSWORD=email_password
```

### 7. docker-compose 실행

```7.
docker-compose up -d
```

### 8. 브라우저 접속

```8.
http://localhost
```


FROM node:20.7.0-alpine AS build

RUN npm install -g pnpm
COPY ./ /app/

WORKDIR /app
RUN pnpm install
RUN pnpm build

FROM caddy:alpine
COPY --from=build /app/dist/ /www/
COPY ./Caddyfile /etc/caddy/Caddyfile